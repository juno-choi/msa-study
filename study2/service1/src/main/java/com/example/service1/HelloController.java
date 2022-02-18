package com.example.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-service")
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "hello first service";
    }
}
