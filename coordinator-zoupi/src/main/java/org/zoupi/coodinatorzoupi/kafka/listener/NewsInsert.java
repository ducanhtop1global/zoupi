package org.zoupi.coodinatorzoupi.kafka.listener;

import io.grpc.ManagedChannelBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.zoupi.coodinatorzoupi.entities.GroupVideo;
import org.zoupi.coodinatorzoupi.entities.UrlVideo;
import org.zoupi.video.GetVideoToFragmentationGrpc;
import org.zoupi.video.GetVideoToFragmentationRequest;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class NewsInsert {
    private final ReactiveMongoTemplate mongoTemplate;
    @KafkaListener(topics = "news_insert", id = "shard_data")
    void listen(String id_author) {
        Mono.just(id_author).flatMap(i -> {
            System.out.println(i);
            var channel = ManagedChannelBuilder.forAddress("localhost", 6001).usePlaintext().build();
            var stub = GetVideoToFragmentationGrpc.newBlockingStub(channel);
            var request = GetVideoToFragmentationRequest.newBuilder().setId(i).build();
            var response = stub.get(request);
            channel.shutdownNow();
            return Mono.just(response.getCategory()).flatMap(b -> mongoTemplate.findOne(getGrVByCategory(response.getCategory()), GroupVideo.class, "Shards").doOnError(Throwable::printStackTrace).map(GroupVideo::getIds)).doOnError(Throwable::printStackTrace).flatMap(r -> {
                        var arr = new ArrayList<>(Arrays.stream(r).toList());
                        arr.add(response.getIdVideo());
                        var upd = new Update();
                        upd.set("ids", arr);
                        return mongoTemplate.findAndModify(getGrVByCategory(response.getCategory()), upd, GroupVideo.class, "Shards").doOnError(Throwable::printStackTrace);
                    }).doOnError(Throwable::printStackTrace)
                    .flatMap(r -> mongoTemplate.insert(UrlVideo.builder().url(response.getUrlVideo()).id_video(response.getIdVideo()), "UrlVideos"))
                    .doOnError(Throwable::printStackTrace);
        }).subscribe();
    }
    private Query getGrVByCategory(String category) {
        return Query.query(Criteria.where("category").is(category));
    }
}
