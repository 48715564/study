package com.example.client.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="micservice",fallback = HystrixClientFallback.class)
public interface HelloWorldFeignClient {
    @RequestMapping(method = RequestMethod.GET, value="/helloworld/say")
    public String say();
}