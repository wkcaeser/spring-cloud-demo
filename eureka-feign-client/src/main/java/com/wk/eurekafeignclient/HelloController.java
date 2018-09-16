package com.wk.eurekafeignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final EurekaClientFeign eurekaClientFeign;

    @Autowired
    public HelloController(EurekaClientFeign eurekaClientFeign) {
        this.eurekaClientFeign = eurekaClientFeign;
    }

    @GetMapping("/hello")
    public String hello() {
        return eurekaClientFeign.hello();
    }
}
