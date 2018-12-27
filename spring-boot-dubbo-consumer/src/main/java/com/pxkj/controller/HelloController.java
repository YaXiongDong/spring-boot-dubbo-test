package com.pxkj.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pxkj.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference(
            version = "${consumer.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:20880"
    )
    private HelloService helloService;

    @RequestMapping("/sayHello")
    public String sayHello(String name) {
        return helloService.sayHello(name);
    }

}
