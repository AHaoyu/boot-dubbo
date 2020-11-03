package com.producer;

import com.api.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String say(String name) {
        return "hello" +name;
    }
}
