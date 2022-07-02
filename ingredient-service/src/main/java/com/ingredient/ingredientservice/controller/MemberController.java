package com.ingredient.ingredientservice.controller;

import com.ingredient.ingredientservice.entity.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/member/{id}")
    public Member getMember(@PathVariable Long id) {
        Member member = new Member();
        member.setId(id);
        member.setName("테스트 ID = " +id);
        return member;
    }

}
