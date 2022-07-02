package com.client.ingredientclient.controller;

import com.client.ingredientclient.entity.Member;
import com.client.ingredientclient.feign.MemberClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class FeignController {

    private final MemberClient memberClient;

    @GetMapping("/{id}")
    public String getMember(@PathVariable Long id) {
        Member member = memberClient.getMember(id);
        System.out.println("member = " + member.getName());
        return member.getName();
    }
}
