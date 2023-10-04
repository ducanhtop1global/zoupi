package org.zoupi.pickup.algorithm;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.zoupi.pickup.entities.mongo.GroupVideo;
import org.zoupi.pickup.repository.HttpGetRepo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class BasicPickup {
    private final HttpGetRepo getRepo;
    public Mono<ArrayList<String>> pickupDef(int page_number) {
        var page = PageRequest.of(page_number, 10);
        return getRepo.getDef(page).collectList().map(ll -> {
            var result = new ArrayList<String>(11);

            return result;
        });
    }
    public Flux<List<String>> basicPickup(int page_number, String id) {
        return null;
    }
}
