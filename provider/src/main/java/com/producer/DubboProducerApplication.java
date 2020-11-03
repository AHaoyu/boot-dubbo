package com.producer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboProducerApplication {

    public static void main(String[] args) {
        System.setProperty("nacos.standalone", "true");
        SpringApplication.run(DubboProducerApplication.class, args);
    }
}
