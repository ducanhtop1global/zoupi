package org.zoupi.coodinatorzoupi.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "ViewedDto")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ViewedVideo {
    private @MongoId String id;
    private String id_author;
    private String[] idVideos;
}
