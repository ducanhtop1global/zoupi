package org.zoupi.coodinatorzoupi.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "Shards")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Setter
public class GroupVideo {
    private @MongoId String id;
    private @Field String category;
    private @Field String[] ids;
    private @Field int priority;
}
