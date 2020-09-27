package com.lvtuben.istio.web;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class OpWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpWebApplication.class, args);
    }

}
