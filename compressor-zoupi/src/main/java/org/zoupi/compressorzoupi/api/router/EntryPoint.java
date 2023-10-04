package org.zoupi.compressorzoupi.api.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.zoupi.compressorzoupi.api.handler.EntryPointHandler;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class EntryPoint {
    @Bean
    public RouterFunction<ServerResponse> addSingle(EntryPointHandler handler) {
        return route().POST("/addSingle", handler::addSingle).build();
    }
    @Bean
    public RouterFunction<ServerResponse> getSingle(EntryPointHandler handler) {
        return route().GET("/getSingle", handler::getSingle).build();
    }
}
