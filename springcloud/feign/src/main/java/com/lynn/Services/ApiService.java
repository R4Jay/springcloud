package com.lynn.Services;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//指定fallback 后台处理类
@FeignClient(value="eurekaclient",fallback = ApiServiceError.class)
public interface ApiService {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String index();

    @RequestMapping(value = "info",method = RequestMethod.GET)
    String info();

    @GetMapping("/hello")
    String hello(@RequestParam(value = "name") String name);
}
