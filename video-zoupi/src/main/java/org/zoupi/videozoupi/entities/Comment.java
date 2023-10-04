package org.zoupi.videozoupi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.Binary;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Builder
@Document("Comment")
public class Comment {
    private @MongoId String id;
    private Integer amount_tym;
    private Integer amount_dislike;
    private LocalDate publish_at;
    private String id_author;
    private String name_author;
    private String url_image_author;
    private Comment[] reply;
}
