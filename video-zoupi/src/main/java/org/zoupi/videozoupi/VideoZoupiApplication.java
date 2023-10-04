package org.zoupi.videozoupi;

import com.cloudinary.Cloudinary;
import io.github.cdimascio.dotenv.Dotenv;
import io.grpc.ServerBuilder;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatProtocolHandlerCustomizer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.core.task.support.TaskExecutorAdapter;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.zoupi.videozoupi.entities.Sound;
import org.zoupi.videozoupi.entities.Video;
import org.zoupi.videozoupi.grpc.ServiceImpl.GetVidToFragmentationImpl;
import org.zoupi.videozoupi.repository.VideoExc;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;

@SpringBootApplication
@EnableDiscoveryClient
public class VideoZoupiApplication {
    public static void main(String[] args) {
        SpringApplication.run(VideoZoupiApplication.class, args);
    }
    @Autowired
    private ReactiveRedisConnectionFactory factory;
    @PostConstruct
    public void clearCache() {
        factory.getReactiveConnection().serverCommands().flushAll().subscribe();
    }
    @Bean
    public AsyncTaskExecutor asyncTaskExecutor() {
        return new TaskExecutorAdapter(Executors.newVirtualThreadPerTaskExecutor());
    }
    @Bean
    public TomcatProtocolHandlerCustomizer<?> protocolHandlerCustomizer() {
        return protocolHandler -> {
            protocolHandler.setExecutor(Executors.newVirtualThreadPerTaskExecutor());
        };
    }
    @Bean
    ApplicationRunner runner(GetVidToFragmentationImpl getVidToFragmentation) {
        return args -> {
            Thread.startVirtualThread(() -> {
                var server = ServerBuilder.forPort(6001).addService(getVidToFragmentation).build();
                try {
                    server.start();
                    System.out.println("started server grpc");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        };
    }
//    @Bean
//    ApplicationRunner addData(VideoExc videoExc, ReactiveMongoTemplate mongoTemplate) {
//        return args -> {
//            var dotenv = Dotenv.load();
//            Cloudinary cloudinary = new Cloudinary(dotenv.get("CLOUDINARY_URL"));
//            cloudinary.config.secure = true;
//            cloudinary.config.cloudName = "dgp6k7pa2";
//            Mono.just(cloudinary.search()).map(e -> {
//                try {
//                    return (List<Map<String, Object>>) e.expression("folder:zoupi/*").execute().get("resources");
//                } catch (Exception ex) {
//                    throw new RuntimeException(ex);
//                }
//            }).doOnError(Throwable::printStackTrace).doOnNext(e -> {
//                e.forEach(v -> {
//                    var video = Video.builder()
//                            .amountShared(0)
//                            .amountTym(0)
//                            .caption("ducanhtop1global")
//                            .category("owner")
//                            .nameSound("deo biet")
//                            .tags(List.of("ducanh", "top1devjava"))
//                            .listIdComments(List.of())
//                            .urlFile(v.get("secure_url").toString())
//                            .listIdUserLiked(List.of())
//                            .idAuthor("ducanhtop1")
//                            .publishAt(LocalDateTime.now().toLocalDate())
//                            .nameAuthor("ducanhhihi")
//                            .build();
//                    mongoTemplate.insert(video, "Videos").doOnError(Throwable::printStackTrace).subscribe();
//                });
//            }).subscribe();
//        };

}
