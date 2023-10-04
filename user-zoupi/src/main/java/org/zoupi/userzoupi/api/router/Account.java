package org.zoupi.userzoupi.api.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.zoupi.userzoupi.api.handler.AccountHandler;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class Account {
    @Bean
    public RouterFunction<ServerResponse> getAcc(AccountHandler handler) {
        return route().GET("/getAcc", handler::getAcc).build();
    }
    @Bean
    public RouterFunction<ServerResponse> addAcc(AccountHandler handler) {
        return route().POST("/addAcc", handler::addAcc).build();
    }
    @Bean
    public RouterFunction<ServerResponse> addAccAndCreateUserDef(AccountHandler handler) {
        return route().POST("/addAccAndCreateUserDef", handler::addAndCreateUsrDef).build();
    }
    @Bean
    public RouterFunction<ServerResponse> updateAcc(AccountHandler handler) {
        return route().PUT("/updatePass", handler::updatePass).build();
    }
}
