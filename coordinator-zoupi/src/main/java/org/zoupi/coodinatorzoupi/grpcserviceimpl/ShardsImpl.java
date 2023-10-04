package org.zoupi.coodinatorzoupi.grpcserviceimpl;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.zoupi.coodinatorzoupi.entities.GroupVideo;
import org.zoupi.coordinator.InsertCategoryIfEmptyReq;
import org.zoupi.coordinator.InsertCategoryIfEmptyRes;
import org.zoupi.coordinator.ShardsGrpc;
import reactor.core.publisher.Mono;
@Component
@RequiredArgsConstructor
@GrpcService
public class ShardsImpl extends ShardsGrpc.ShardsImplBase {
    private final ReactiveMongoTemplate mongoTemplate;
    @Override
    public void insertCategoryIfEmpty(InsertCategoryIfEmptyReq request, StreamObserver<InsertCategoryIfEmptyRes> responseObserver) {
        Mono.just(request).flatMap(req -> mongoTemplate.exists(Query.query(Criteria.where("category").is(req.getCategory())), "Shards").flatMap(bol -> {
            String[] arr = {};
            if (bol) {
                return mongoTemplate.insert(GroupVideo.builder().priority(0).category(req.getCategory()).ids(arr).build()).map(r -> true);
            } else return Mono.just(false);
        })).doOnNext(bool -> {
            var res = InsertCategoryIfEmptyRes.newBuilder().setIsInsert(bool).build();
            responseObserver.onNext(res);
            responseObserver.onCompleted();
        });
    }
}
