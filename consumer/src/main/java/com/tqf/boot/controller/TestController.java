package com.tqf.boot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.service.DemoService;
import com.tqf.boot.model.Request;
import com.tqf.boot.model.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference
    DemoService service;

    @RequestMapping("/helloworld")
    public Response helloworld(Request request) throws InterruptedException {
        Response response = new Response();
        response.setCode("200");
        response.setMessage(service.hello("hello world"));
        Thread.sleep(1500);
        return response;
    }
}
