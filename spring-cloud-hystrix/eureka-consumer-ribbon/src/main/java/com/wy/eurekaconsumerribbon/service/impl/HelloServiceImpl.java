package com.wy.eurekaconsumerribbon.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wy.eurekaconsumerribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "handleError")
    @Override
    public String hello(String name) {
        return restTemplate.getForObject("http://eureka-service-provider/hello/index?name="+name, String.class);
    }

    /**
     * @description: 断路器方法
     * @return
     */
    public String handleError(String name) {
        return "hello  "+name +",I am so sorry,Server has error";
    }

}
