package org.zoupi.coodinatorzoupi;

import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;
import org.zoupi.coodinatorzoupi.entities.GroupVideo;
import org.zoupi.coodinatorzoupi.entities.UrlVideo;
import org.zoupi.coodinatorzoupi.grpcserviceimpl.ShardsImpl;
import org.zoupi.coodinatorzoupi.grpcserviceimpl.VideoViewImpl;
import org.zoupi.video.GetVideoToFragmentationGrpc;
import org.zoupi.video.GetVideoToFragmentationRequest;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class CoordinatorZoupiApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoordinatorZoupiApplication.class, args);
    }

    @Bean
    ApplicationRunner runner(ShardsImpl shards, VideoViewImpl videoView) {
        return args -> {
            Thread.startVirtualThread(() -> {
                Server server = ServerBuilder.forPort(6003).addService(shards).addService(videoView).build();
                try {
                    server.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        };
    }

    @Bean
    public NewTopic newTopic() {
        return TopicBuilder.name("news_insert").partitions(5).replicas(3).build();
    }

}
