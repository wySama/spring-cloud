package com.wy.eurekaconsumerribbon.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wy.eurekaconsumerribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ribbon")
public class TestController {

    @Autowired
    private HelloService helloService;


    @RequestMapping(value = "/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return helloService.hello(name);
    }


}
