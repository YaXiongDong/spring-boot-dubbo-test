package com.pxkj.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pxkj.service.HelloService;

@Service(version = "${provider.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
