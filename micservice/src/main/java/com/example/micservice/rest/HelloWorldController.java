package com.example.micservice.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoubo
 * @time 2020年2月17日11:29:19
 * 测试
 */
@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {
    @Value("${word}")
    private String word;
    /**
     * 打印hello world
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value="/say")
    public String say(){
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return word;
    }
}
