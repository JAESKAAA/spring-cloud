package com.client.ingredientclient.feign;

import com.client.ingredientclient.entity.Member;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * feign 클라이언트 사용 시, 기본적으로 로드밸런싱 된 인스턴스를 가져다 사용하게 됨
 */

@FeignClient("ingredient-service")
public interface MemberClient {

    @GetMapping("/member/{id}")
    Member getMember(@PathVariable Long id);

}
