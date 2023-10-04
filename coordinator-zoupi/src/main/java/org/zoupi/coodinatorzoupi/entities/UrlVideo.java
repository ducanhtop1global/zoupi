package org.zoupi.coodinatorzoupi.entities;

import jakarta.ws.rs.GET;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "UrlVideos")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UrlVideo {
    private @MongoId String id;
    private @Field String id_video;
    private @Field String url;
}
