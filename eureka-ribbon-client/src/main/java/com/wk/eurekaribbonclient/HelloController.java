package com.wk.eurekaribbonclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    private final RestTemplate restTemplate;

    @Autowired
    public HelloController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/hello")
    @HystrixCommand(fallbackMethod = "error")
    public String hello(){
        return restTemplate.getForObject("http://eureka-client/hello", String.class);
    }

    public String error() {
        return "service error";
    }
}
