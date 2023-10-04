package org.zoupi.sortzoupi;

import io.grpc.ManagedChannelBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.zoupi.coordinator.GetVideoViewReq;
import org.zoupi.coordinator.VideoViewGrpc;
import org.zoupi.sortzoupi.entities.GroupVideo;
import reactor.core.publisher.Mono;

import java.util.*;

@Component
@RequiredArgsConstructor
public class SortBasic {
    private final ReactiveMongoTemplate mongoTemplate;
    public void sortByView(String category, String[] ids) {
        Mono.just(ids).map(a -> {
            var list = new ArrayList<Map<String, Object>>();
            Arrays.stream(a).forEach(id -> {
                var channel = ManagedChannelBuilder.forAddress("localhost", 6003).usePlaintext().build();
                var stub = VideoViewGrpc.newBlockingStub(channel);
                var req = GetVideoViewReq.newBuilder().setId(id).build();
                var res = stub.get(req);
                Map<String, Object> map = new HashMap<>();
                map.put("id", id);
                map.put("view", res.getAmountView());
                list.add(map);
                channel.shutdownNow();
            });
            list.sort(Comparator.comparingInt(c -> (int)c.get("view")));
            Collections.reverse(list);
            return list;
        }).flatMap(list -> {
            var upd = new Update();
            var newList = list.stream().map(m -> (String)m.get("id"));
            upd.set("ids", newList.toArray());
            return mongoTemplate.updateFirst(Query.query(Criteria.where("category").is(category)), upd, GroupVideo.class);
        }).doOnError(Throwable::printStackTrace).subscribe();
    }
}
