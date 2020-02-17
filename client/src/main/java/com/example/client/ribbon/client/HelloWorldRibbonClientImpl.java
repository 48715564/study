package com.example.client.ribbon.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HelloWorldRibbonClientImpl implements HelloWorldRibbonClient {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public String say() {
        return restTemplate.getForObject("http://micservice/helloworld/say",String.class);
    }
}
