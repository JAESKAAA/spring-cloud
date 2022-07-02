package com.client.ingredientclient.service;

import com.client.ingredientclient.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ServiceCode {

    private final WebClient.Builder webClient;
    private final String SERVICE_NAME = "http://ingredient-service";
    private final String REQUEST_URI = "/members/{id}";

    public Mono<Member> getMember(Long id) {
        Mono<Member> memberMono = webClient.build().get()
            .uri(SERVICE_NAME + REQUEST_URI, id)
            .retrieve().bodyToMono(Member.class);
        return memberMono;
    }

}
