package com.lynn.Controllers;

import com.lynn.Services.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
//@RequestMapping("/hello")
public class FeignController {

    @Autowired
    ApiService apiService;

    @RequestMapping("/feign")
    public String GetFstFeingn()
    {
        String result = apiService.index();
        return result;
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable(value = "name") String name) {
        return apiService.hello(name + "\r\n" + new Date());
    }
}
