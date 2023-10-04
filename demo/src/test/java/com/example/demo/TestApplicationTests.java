package com.example.demo;


import lombok.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.MongoExpression;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.time.LocalDate;
import java.util.*;

@SpringBootTest
class TestApplicationTests {
	@Autowired
	ReactiveMongoTemplate mongoTemplate;
	@Test
	void contextLoads() {
		String[] strings = {"dsfs","sdfsdf"};
		var list = new ArrayList<>(List.of(strings));
		list.add("sdf");
		list.forEach(System.out::println);
	}
}


@Document(collection = "Shards")
record GroupVideo(@Field String category, @Field String[] ids) {}
@Document(collection = "UrlVideos")
record UrlVideo(@Field String idVideo, @Field String url) {}
@Document(collection = "ViewedVideos")
record ViewedVideo(@Field String idAuth, @Field String idVideo) {}

@AllArgsConstructor
@Getter
@Setter
@Builder
@Document("Sound")
class Sound {
	private @MongoId String id;
	private String name;
	private byte[] rawData;
}