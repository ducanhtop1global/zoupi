package org.zoupi.videozoupi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.Binary;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@AllArgsConstructor
@Getter
@Setter
@Builder
@Document("Sound")
public class Sound {
    private @MongoId String id;
    private String name;
    private byte[] rawData;
}
