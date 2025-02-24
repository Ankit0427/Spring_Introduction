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
        return "Hello from bridgelab ";
    }
}

@RestController
@RequestMapping("/abc")
 class HelloWorldControl {
    @GetMapping("/helloPage")
    public String showHelloPage() {
        return "hello from Bridgelab"; // Refers to hello.html in templates folder
    }
}
