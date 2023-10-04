package org.zoupi.coodinatorzoupi.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Document(collection = "VideoViews")
public class VideoView {
    private @MongoId String id;
    private @Field String id_video;

    private @Field Integer amount_view;
}
