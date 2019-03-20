package com.lynn.Controllers;

import com.lynn.Services.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    ApiService apiService;

    @RequestMapping("/feign")
    public String GetFstFeingn()
    {
        String result = apiService.index();
        return result;
    }
}
