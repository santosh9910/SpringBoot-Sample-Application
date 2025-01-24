package com.example.springBootProjectt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class Hello {


    @GetMapping("/hello")
    public String getResponce(){

        return "Welcome to Spring-Boot Project";
    }
}
