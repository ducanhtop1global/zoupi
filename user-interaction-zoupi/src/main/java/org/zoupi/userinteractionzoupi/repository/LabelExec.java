package org.zoupi.userinteractionzoupi.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LabelExec {
    private final ReactiveMongoTemplate mongoTemplate;
}
