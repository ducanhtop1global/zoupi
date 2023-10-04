package org.zoupi.pickup.entities.mongo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "ViewedVideos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ViewedVideo {
    private @Field String idAuth;
    private @Field String idVideo;
}
