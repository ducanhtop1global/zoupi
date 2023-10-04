package org.zoupi.videozoupi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.Binary;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Builder
@Document(collection = "Videos")
public class Video {
    private @MongoId String id;
    private @Field String url_file;
    private @Field String caption;
    private @Field String[] tags;
    private @Field String id_author;
    private @Field String name_author;
    private @Field LocalDateTime publish_at;
    private @Field String sound_id;
    private @Field Integer amount_tym;
    private @Field Integer amount_shared;
    private @Field String[] id_user_liked;
    private @Field String[] id_user_commented;
    private @Field String category;
}
