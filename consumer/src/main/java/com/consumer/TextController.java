package com.consumer;


import com.api.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {

    @Reference
    private HelloService helloService;


    @GetMapping("/text")
    public String text(){
        return helloService.say("cartoon");
    }
}
