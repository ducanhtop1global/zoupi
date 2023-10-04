package org.zoupi.userzoupi.api.handler;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.zoupi.userzoupi.entities.Account;
import org.zoupi.userzoupi.entities.User;
import org.zoupi.userzoupi.entities.dto.AccDto;
import org.zoupi.userzoupi.entities.dto.UpdateAccDto;
import org.zoupi.userzoupi.repository.AccountEx;
import org.zoupi.userzoupi.repository.UserEx;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.util.List;

@Component
public class AccountHandler {
    @Autowired
    AccountEx accountEx;
    @Autowired
    UserEx userEx;
    private JSONObject cvAToJs(Account account) {
        var js = new JSONObject();
        js.append("username", account.getUsername());
        js.append("password", account.getPassword());
        js.append("createdAt", account.getCreatedAt());
        js.append("isLock", account.isLock());
        return js;
    }
    public Mono<ServerResponse> getAcc(ServerRequest serverRequest){

        String un = serverRequest.queryParam("username").get();
        String pass = serverRequest.queryParam("password").get();
        return accountEx.getByUsrNPsw(un, pass).flatMap(a -> a.map(account -> ServerResponse.ok().bodyValue(cvAToJs(account))).orElseGet(() -> ServerResponse.badRequest().build()));
    }

    public Mono<ServerResponse> addAcc(ServerRequest serverRequest) {
         return serverRequest.bodyToMono(AccDto.class).flatMap(a -> {
             if(!a.getUsername().isEmpty()&&!a.getPassword().isEmpty()) {
                 return accountEx.addAcc(a.getUsername(), a.getPassword()).flatMap(oa -> oa.map(account -> userEx.addUser(new User(account.getUsername(), "", LocalDate.now(), account.getId(), List.of(""), List.of(""), "", "")).flatMap(r -> {
                     if(r.isPresent()) return ServerResponse.ok().build();
                     else return ServerResponse.badRequest().build();
                 })).orElseGet(() -> ServerResponse.badRequest().build()));
             } else return ServerResponse.badRequest().build();
         });
    }
    public Mono<ServerResponse> updatePass(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(UpdateAccDto.class).flatMap(dto -> accountEx.updatePass(dto.getUsername(), dto.getPassword(), dto.getNewPass())).flatMap(bol -> bol ? ServerResponse.ok().build() : ServerResponse.badRequest().build());
    }

    public Mono<ServerResponse> addAndCreateUsrDef(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(AccDto.class).flatMap(dto -> accountEx.addAcc(dto.getUsername(), dto.getPassword())).flatMap(a -> {
            if(a.isPresent()) {
                return ServerResponse.ok().build();
            } else return ServerResponse.badRequest().build();
        });
    }
}
