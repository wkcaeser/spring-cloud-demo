package com.wk.eurekafeignclient;

import org.springframework.stereotype.Component;

@Component
public class FallbackHystrix implements EurekaClientFeign {
    @Override
    public String hello() {
        return "service error, Feign";
    }
}
