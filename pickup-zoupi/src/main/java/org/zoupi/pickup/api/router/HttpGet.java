package org.zoupi.pickup.api.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.zoupi.pickup.api.handler.HttpGetHandler;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class HttpGet {
    @Bean
    public RouterFunction<ServerResponse> getDefault(HttpGetHandler getHandler) {
        return route().GET("/getDefault", getHandler::getDefault).build();
    }
}
