package com.example.spring_simpleapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public @ResponseBody String hello() {
        String msg = "안녕하세요 반갑습니다!";
        return msg;
    }

}
