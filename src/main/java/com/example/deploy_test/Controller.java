package com.example.deploy_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/health")
    public @ResponseBody String healthCheck() {
        return "잘 실행되었습니다. UP";
    }
}
