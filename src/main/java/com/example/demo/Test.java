package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class Test {

    @Value("${value.from.file}")
    private String hello;
    
    @GetMapping("hello")
    public String getHello() {
        return hello;
    }
}
