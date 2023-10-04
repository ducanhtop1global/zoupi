package org.zoupi.userinteractionzoupi.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "Labels")
public class Label {
    private @MongoId String id;
    private @Field String id_user;
    private String[] labels;
}
