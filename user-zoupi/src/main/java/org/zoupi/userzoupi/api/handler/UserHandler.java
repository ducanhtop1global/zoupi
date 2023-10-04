package org.zoupi.userzoupi.api.handler;

import org.bson.json.JsonObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.zoupi.userzoupi.entities.User;
import org.zoupi.userzoupi.entities.dto.*;
import org.zoupi.userzoupi.repository.AccountEx;
import org.zoupi.userzoupi.repository.UserEx;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Objects;

@Component
public class UserHandler {
    @Autowired
    UserEx userEx;
    @Autowired
    AccountEx accountEx;
    public Mono<ServerResponse> getUser(ServerRequest serverRequest) {
        String idA = Objects.requireNonNull(serverRequest.cookies().getFirst("idAccount")).getValue();
        return userEx.getUsrByAcc(idA).flatMap(u -> u.map(user -> ServerResponse.ok().bodyValue(cvUsToJson(user))).orElseGet(() -> ServerResponse.badRequest().build()));
    }
    private JSONObject cvUsToJson(User user) {
        JSONObject js = new JSONObject();
        js.append("name", user.getName());
        js.append("email", user.getEmail());
        js.append("birthday", user.getBirthday());
        js.append("videoPublishedIds", user.getVideoPublishedIds());
        js.append("videoLikedIds", user.getVideoLikedIds());
        js.append("avtUrl", user.getAvtUrl());
        js.append("description", user.getDescription());
        return js;
    }
    public Mono<ServerResponse> addUser(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(UserDto.class).doOnError(System.out::println).flatMap(dto -> {
            if(dto!=null) {
                var nU = new User(dto.getName(), dto.getEmail(), dto.getBirthday(), dto.getAccountId(),dto.getVideoPublishedIds(), dto.getVideoLikedIds(),dto.getAvtUrl(),dto.getDescription());
                return userEx.addUser(nU).flatMap(u -> ServerResponse.ok().build());
            } else return ServerResponse.badRequest().build();
        });
    }
    public Mono<ServerResponse> addUserDefault(ServerRequest request) {
        return request.bodyToMono(NewUserDto.class).doOnError(System.out::println).flatMap(dto -> {
            if(dto!=null) {
                var nU = new User(dto.getName(), dto.getEmail(), dto.getBirthday(), dto.getAccId(), List.of(), List.of(), "", "");
                return userEx.addUser(nU).flatMap(u -> ServerResponse.ok().build());
            } else return ServerResponse.badRequest().build();
        });
    }
    public Mono<ServerResponse> updateUser(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(UserUpdDto.class).flatMap(dto -> {
            if(!dto.getFieldName().isEmpty() && !dto.getValue().isEmpty()) {
                return userEx.updateFieldUser(dto.getAccId(), dto.getFieldName(), dto.getValue()).flatMap(b -> b ? ServerResponse.ok().build() : ServerResponse.badRequest().build());
            } else return ServerResponse.badRequest().build();
        });
    }

    public Mono<ServerResponse> removeUser(ServerRequest request) {
        return request.bodyToMono(removeUsrDto.class).flatMap(dto -> accountEx.accExist(dto.getUsername(), dto.getPassword()).flatMap(bol -> {
            if(bol) return userEx.removeUser(dto.getAccId()).flatMap(r -> r ? ServerResponse.ok().build() : ServerResponse.badRequest().build());
            else return ServerResponse.badRequest().build();
        }));
    }
}
