package org.zoupi.pickup.api.handler;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.zoupi.pickup.algorithm.BasicPickup;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class HttpGetHandler {
    private final BasicPickup basicPickup;
    public Mono<ServerResponse> getDefault(ServerRequest serverRequest) {
        int page_number = Integer.parseInt(serverRequest.queryParam("page").get());
        return null;
    }
}
