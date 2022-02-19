package com.example.service1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-service")
@Slf4j
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "hello first service";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("first-request") String header){
        log.info("header = {}",header);
        return "header = "+header;
    }
}
