package com.example.ecs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by jg 2021/05/24
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String test() {
        return "test";
    }
}
