package org.zoupi.userzoupi.api.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.zoupi.userzoupi.api.handler.AccountHandler;
import org.zoupi.userzoupi.api.handler.UserHandler;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class User {
    @Bean
    public RouterFunction<ServerResponse> getUser(UserHandler handler) {
        return route().GET("/getUser", handler::getUser).build();
    }
    @Bean
    public RouterFunction<ServerResponse> addUser(UserHandler handler) {
        return route().POST("/addUser", handler::addUser).build();
    }
    @Bean
    public RouterFunction<ServerResponse> addUserDef(UserHandler handler) {
        return route().POST("/addUserDefault", handler::addUserDefault).build();
    }
    @Bean
    public RouterFunction<ServerResponse> removeUser(UserHandler handler) {
        return route().DELETE("/removeUser", handler::removeUser).build();
    }
    @Bean
    public RouterFunction<ServerResponse> updateUser(UserHandler handler) {
        return route().PUT("/updateUser", handler::updateUser).build();
    }
}
