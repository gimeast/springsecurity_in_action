package com.gimeast.ch2ex1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * @Method         : hello
     * @Description    : 스프링 시큐리티 기본 구성으로 작동시켜보기 위한 예제 api
     * @Author         : donguk
     * @Date           : 2023. 10. 31.
     * @return         : String
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }
}
