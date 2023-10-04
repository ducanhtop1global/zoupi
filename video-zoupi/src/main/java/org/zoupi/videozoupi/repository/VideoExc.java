package org.zoupi.videozoupi.repository;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import io.grpc.ManagedChannelBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.zoupi.coordinator.InsertCategoryIfEmptyReq;
import org.zoupi.coordinator.InsertCategoryIfEmptyReqOrBuilder;
import org.zoupi.coordinator.ShardsGrpc;
import org.zoupi.videozoupi.entities.Video;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VideoExc {
    private final ReactiveMongoTemplate mongoTemplate;
    private Query queryVidById(String id) {
        return Query.query(Criteria.where("id").is(id));
    }

    private Query queryVidByIdAuthor(String idAuthor) {
        return Query.query(Criteria.where("id_author").is(idAuthor));
    }

    public Mono<Boolean> checkVidExistById(String id) {
        return mongoTemplate.exists(Query.query(Criteria.where("id").is(id)), "Videos");
    }
    public Mono<Optional<Video>> getVideoById(String id) {
        return checkVidExistById(id).flatMap(bol -> bol ? mongoTemplate.findOne(queryVidById(id), Video.class).map(Optional::of) : Mono.just(Optional.empty()));
    }
    public Mono<Optional<Video>> getVideoByIdAuthor(String id) {
        return mongoTemplate.findOne(queryVidByIdAuthor(id), Video.class, "Videos").map(Optional::of);
    }
    public Mono<Optional<Video>> save(Video video) {
        return checkVidExistById(video.getId()).flatMap(bol -> {
            if (bol) return Mono.just(Optional.empty());
            else return mongoTemplate.save(video, "Videos").map(Optional::of).doOnNext(b -> {
                var channel = ManagedChannelBuilder.forAddress("localhost", 6003).usePlaintext().build();
                var stub = ShardsGrpc.newBlockingStub(channel);
                var req = InsertCategoryIfEmptyReq.newBuilder().setCategory(video.getCategory()).build();
                var res = stub.insertCategoryIfEmpty(req);
                channel.shutdownNow();
            });
        });
    }
    public Mono<Boolean> deleteVideo(String id) {
        return checkVidExistById(id).flatMap(bol -> {
            if (bol) return mongoTemplate.remove(queryVidById(id), "Videos").map(DeleteResult::wasAcknowledged);
            else return Mono.just(false);
        });
    }
}
