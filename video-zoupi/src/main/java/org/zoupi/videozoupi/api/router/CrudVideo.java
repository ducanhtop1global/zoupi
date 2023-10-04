package org.zoupi.videozoupi.api.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.zoupi.videozoupi.api.handler.CrudVideoHandler;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CrudVideo {
    @Bean
    public RouterFunction<ServerResponse> addVideoHttp(CrudVideoHandler handler) {
        return route().POST("/addVideoHttp", handler::addVideoHttp).build();
    }
    @Bean
    public RouterFunction<ServerResponse> getVideoHttp(CrudVideoHandler handler) {
        return route().GET("/getVideoHttp", handler::getVideoHttp).build();
    }
    @Bean
    public RouterFunction<ServerResponse> updateVideo(CrudVideoHandler handler) {
        return route().PUT("/updateVideoHttp", handler::updateVideoHttp).build();
    }
    @Bean
    public RouterFunction<ServerResponse> deleteVideo(CrudVideoHandler handler) {
        return route().DELETE("/deleteVideoHttp", handler::deleteVideoHttp).build();
    }
}
