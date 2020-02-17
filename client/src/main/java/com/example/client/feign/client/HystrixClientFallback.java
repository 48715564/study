package com.example.client.feign.client;

import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements HelloWorldFeignClient {
    @Override
    public String say() {
        return "default say";
    }
}
