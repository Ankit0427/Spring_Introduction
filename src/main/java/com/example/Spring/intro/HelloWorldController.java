package com.example.Spring.intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWorldController {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class, args);
    }
}

@RestController
@RequestMapping("/api")
class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "<h1>Hello, World!</h1>";
    }
}