package org.zoupi.pickup.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.zoupi.pickup.entities.mongo.GroupVideo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class HttpGetRepo {
    private final ReactiveMongoTemplate mongoTemplate;
    public Flux<List<String>> getDef(Pageable page) {
        return mongoTemplate.find(Query.query(Criteria.where("category").is("trending")).with(page), GroupVideo.class).map(gr -> Arrays.stream(gr.getIds()).toList());
    }
    public Flux<List<String>> get(Pageable pageable, String id_user) {
        return null;
    }
}
