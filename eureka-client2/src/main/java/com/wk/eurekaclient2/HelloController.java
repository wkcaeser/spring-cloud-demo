package com.wk.eurekaclient2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/hello")
    public String hello(){
        return "hello, this app port is " + port;
    }
}
