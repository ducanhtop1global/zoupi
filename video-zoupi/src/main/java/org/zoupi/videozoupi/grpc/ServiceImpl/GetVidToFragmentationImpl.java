package org.zoupi.videozoupi.grpc.ServiceImpl;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.zoupi.video.GetVideoToFragmentationGrpc;
import org.zoupi.video.GetVideoToFragmentationRequest;
import org.zoupi.video.GetVideoToFragmentationResponse;
import org.zoupi.videozoupi.entities.Video;
import reactor.core.publisher.Mono;

@Component
@GrpcService
@RequiredArgsConstructor
public class GetVidToFragmentationImpl extends GetVideoToFragmentationGrpc.GetVideoToFragmentationImplBase {
    private final ReactiveMongoTemplate mongoTemplate;
    @Override
    public void get(GetVideoToFragmentationRequest request, StreamObserver<GetVideoToFragmentationResponse> responseObserver) {
        Mono.just(request.getId()).doOnNext(System.out::println).flatMap(id_video -> mongoTemplate.findOne(Query.query(Criteria.where("id").is(id_video)), Video.class, "Videos").doOnNext(v -> {
            var response = GetVideoToFragmentationResponse.newBuilder().setCategory(v.getCategory()).setIdVideo(v.getId()).setIdAuthor(v.getId_author()).setUrlVideo(v.getUrl_file()).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }).doOnError(Throwable::printStackTrace)).subscribe();
    }
}
