package com.client.ingredientclient.controller;

import com.client.ingredientclient.entity.Member;
import com.client.ingredientclient.service.ServiceCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class MemberController {

    private ServiceCode serviceCode;

    @GetMapping("/member/{id}")
    public void getMember(@PathVariable Long id) {
        Mono<Member> member = serviceCode.getMember(id);

        member.subscribe(
            e -> System.out.println(e));
    }

}
