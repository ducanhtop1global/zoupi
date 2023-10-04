package org.zoupi.videozoupi.api.handler;

import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.zoupi.videozoupi.entities.Video;
import org.zoupi.videozoupi.entities.dto.InsertVideoDto;
import org.zoupi.videozoupi.repository.VideoExc;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CrudVideoHandler {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final VideoExc videoExc;
    public Mono<ServerResponse> addVideoHttp(ServerRequest request) {
        return request.bodyToMono(InsertVideoDto.class).flatMap(vidDto -> {
            var video = Video.builder()
                    .caption(vidDto.getCaption())
                    .category(vidDto.getCategory())
                    .tags(vidDto.getTags().toArray(new String[0]))
                    .amount_shared(0)
                    .amount_tym(0)
                    .id_author(vidDto.getIdAuthor())
                    .id_user_commented(new String[0])
                    .id_user_liked(new String[0])
                    .sound_id("not ready(duc anh dang lam dm doi ty)")
                    .publish_at(LocalDateTime.now())
                    .name_author(vidDto.getNameAuthor())
                    .url_file(vidDto.getUrlFile())
                    .build();
            return videoExc.save(video).doOnNext(v -> {
                kafkaTemplate.send("news_insert", v.get().getId());
            }).doOnNext(v -> {
                kafkaTemplate.send("view_insert", v.get().getId());
            }).flatMap(v -> ServerResponse.ok().bodyValue("duc anh da insert rui nha hihi"));
        });
    }

    public Mono<ServerResponse> getVideoHttp(ServerRequest request) {
        return null;
    }

    public Mono<ServerResponse> updateVideoHttp(ServerRequest request) {
        return null;
    }

    public Mono<ServerResponse> deleteVideoHttp(ServerRequest request) {
        return null;
    }
}
