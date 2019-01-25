package com.wy.eurekaserviceproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/index")
    public String index(@RequestParam String name){
        return "hello "+name+"，this is second messge";
    }
}
