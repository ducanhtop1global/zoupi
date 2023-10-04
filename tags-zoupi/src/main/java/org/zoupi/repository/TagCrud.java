package org.zoupi.repository;

import com.mongodb.client.result.UpdateResult;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.zoupi.entities.Tag;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class TagCrud {
    private final ReactiveMongoTemplate mongoTemplate;

    private Query queryNameTag(String nameTag) {
        return Query.query(Criteria.where("name_tag").is(nameTag));
    }

    public Mono<Optional<String[]>> getIdsByNameTag(String name) {
        return checkTagExist(name).flatMap(b -> {
            if (b) return Mono.just(Optional.empty());
            else return mongoTemplate.findOne(queryNameTag(name), Tag.class).map(Tag::getIds).map(Optional::of);
        });
    }

    public Mono<Boolean> checkTagExist(String tag_name) {
        return mongoTemplate.exists(queryNameTag(tag_name), "Tags");
    }

    public Mono<Boolean> addIdToTag(String name_tag, String id) {
        return mongoTemplate.findOne(queryNameTag(name_tag), Tag.class).map(Tag::getIds).flatMap(ids -> {
            var upd = new Update();
            var list = new ArrayList<>(List.of(ids));
            list.add(id);
            upd.set("ids", list.toArray());
            return mongoTemplate.updateFirst(queryNameTag(name_tag), upd, Tag.class);
        }).map(UpdateResult::wasAcknowledged);
    }

    public Mono<Boolean> addTag(String name_tag, String id_vid) {
        return checkTagExist(name_tag).flatMap(b -> {
            if (b) return Mono.just(false);
            else {
                String[] arr = {id_vid};
                return mongoTemplate.insert(Tag.builder().name_tag(name_tag).ids(arr)).map(r -> true);
            }
        });
    }

    public Mono<Boolean> addNewTag(String name_tag) {
        return checkTagExist(name_tag).flatMap(b -> {
            String[] arr = {};
            if (b) return Mono.just(false);
            else return mongoTemplate.insert(Tag.builder().name_tag(name_tag).ids(arr)).map(r -> true);
        });
    }
}
