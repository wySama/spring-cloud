package com.wy.eurekaconsumerfeign.controller;


import com.wy.eurekaconsumerfeign.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class TestController {

    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping("/index/{name}")
    public  String index(@PathVariable("name") String name){
        return helloRemote.hello(name);
    }
}
