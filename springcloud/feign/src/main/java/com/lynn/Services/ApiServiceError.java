package com.lynn.Services;

import org.springframework.stereotype.Component;

@Component
public class ApiServiceError implements ApiService {
    @Override
    public String index() {
        return "调用服务发生异常";
    }

    @Override
    public String info() {
        return "调用服务发生异常";
    }

    @Override
    public String hello(String name) {
        return "调用服务异常";
    }
}
