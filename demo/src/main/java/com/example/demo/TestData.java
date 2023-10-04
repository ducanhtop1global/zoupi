package com.example.demo;


import lombok.Builder;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;


@Document(collection = "Test")
@Builder
public record TestData(@MongoId String id, @Field String field1, @Field String field2) {
}
