package com.wk.eurekafeignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client", configuration = FeignConfig.class, fallback = FallbackHystrix.class)
public interface EurekaClientFeign {
    @GetMapping("/hello")
    String hello();
}
