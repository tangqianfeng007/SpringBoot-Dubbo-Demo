package com.example.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.service.DemoService;

/**
 * Created by tangqianfeng on 2019/1/27.
 */
@Service
public class DemoServiceIml implements DemoService {
    @Override
    public String hello(String name) {
        return "provider:" + name;
    }
}
