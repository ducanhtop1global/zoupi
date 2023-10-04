package org.zoupi.grpc.ServiceImpl;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.zoupi.repository.TagCrud;
import org.zoupi.tag.GetIdsByTagGrpc;
import org.zoupi.tag.GetIdsByTagReq;
import org.zoupi.tag.GetIdsByTagRes;
import reactor.core.publisher.Mono;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class GetService extends GetIdsByTagGrpc.GetIdsByTagImplBase {
    private final TagCrud tagCrud;
    @Override
    public void getIdsByTag(GetIdsByTagReq request, StreamObserver<GetIdsByTagRes> responseObserver) {
        Mono.just(request.getTag()).flatMap(tag -> {
            if (StringUtils.hasText(tag)) {
                return tagCrud.getIdsByNameTag(tag).doOnNext(ids -> {
                   if (ids.isPresent()) {
                       var res = GetIdsByTagRes.newBuilder().setIds(Arrays.toString(ids.get())).build();
                       responseObserver.onNext(res);
                       responseObserver.onCompleted();
                   }
                });
            } else return Mono.just(false);
        });
    }
}
