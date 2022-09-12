package com.example.jenkinsdeploymenttest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping
    String sayGHello() {
        return "Hello world!";
    }
}
