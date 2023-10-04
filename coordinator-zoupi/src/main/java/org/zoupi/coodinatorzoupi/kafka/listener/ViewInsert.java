package org.zoupi.coodinatorzoupi.kafka.listener;

import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.zoupi.coodinatorzoupi.entities.VideoView;

@Component
@RequiredArgsConstructor
public class ViewInsert {
    private final ReactiveMongoTemplate mongoTemplate;
    @KafkaListener(id = "view_listener", topics = "view_insert")
    public void listen(String id) {
        mongoTemplate.insert(VideoView.builder().amount_view(0).id_video(id).build(), "VideoViews").doOnError(Throwable::printStackTrace).subscribe();
    }
    @KafkaListener(id = "view_listener_increase", topics = "view_increase")
    public void increase(String id) {
        mongoTemplate.findOne(Query.query(Criteria.where("id_video").is(id)), VideoView.class).map(VideoView::getAmount_view).doOnNext(a -> {
            var upd = new Update();
            upd.set("amount_view", a+1);
            mongoTemplate.updateFirst(Query.query(Criteria.where("id").is(id)), upd, VideoView.class).doOnError(Throwable::printStackTrace).subscribe();
        }).subscribe();
    }
}
