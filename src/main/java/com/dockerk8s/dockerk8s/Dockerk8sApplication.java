package com.dockerk8s.dockerk8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class Dockerk8sApplication {

    public static void main(String[] args) {
        SpringApplication.run(Dockerk8sApplication.class, args);
    }

    @GetMapping()
    public String getGreeting(){
        return "Hello, spring boot application.";
    }

}
