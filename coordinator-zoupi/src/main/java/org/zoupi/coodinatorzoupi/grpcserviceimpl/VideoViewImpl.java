package org.zoupi.coodinatorzoupi.grpcserviceimpl;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.zoupi.coodinatorzoupi.entities.VideoView;
import org.zoupi.coordinator.GetVideoViewReq;
import org.zoupi.coordinator.GetVideoViewRes;
import org.zoupi.coordinator.VideoViewGrpc;
@Component
@GrpcService@RequiredArgsConstructor
public class VideoViewImpl extends VideoViewGrpc.VideoViewImplBase {
    private final ReactiveMongoTemplate mongoTemplate;

    @Override
    public void get(GetVideoViewReq request, StreamObserver<GetVideoViewRes> responseObserver) {
        mongoTemplate.findOne(Query.query(Criteria.where("id_video").is(request.getId())), VideoView.class).doOnNext(v -> {
            var res = GetVideoViewRes.newBuilder().setAmountView(v.getAmount_view()).build();
            responseObserver.onNext(res);
            responseObserver.onCompleted();
        }).doOnError(Throwable::printStackTrace).subscribe();
    }
}
