package com.example.client.rest;

import com.example.client.feign.client.HelloWorldFeignClient;
import com.example.client.feign.client.HystrixClientFallback;
import com.example.client.ribbon.client.HelloWorldRibbonClientImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private HelloWorldFeignClient helloWorldFeignClient;
    @Autowired
    private HelloWorldRibbonClientImpl helloWorldRibbonClient;

    @GetMapping("/feign/say")
    public String feignSay() {
        return "feignSay=====>" + helloWorldFeignClient.say();
    }

    @GetMapping("/ribbon/say")
    @HystrixCommand(
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
            }, fallbackMethod = "say"
    )
    public String ribbonSay() {
        return "ribbonSay=====>" + helloWorldRibbonClient.say();
    }

    public String say() {
        return "default say";
    }
}
