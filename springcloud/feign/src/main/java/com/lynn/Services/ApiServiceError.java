package com.lynn.Services;

import org.springframework.stereotype.Component;

@Component
public class ApiServiceError implements ApiService {
    @Override
    public String index() {
        return "调用服务发生异常";
    }
}
