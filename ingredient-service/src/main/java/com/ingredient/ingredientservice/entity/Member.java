package com.ingredient.ingredientservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter // 테스트를 편의를 위해 setter 설정
public class Member {

    private Long id;
    private String name;

}
