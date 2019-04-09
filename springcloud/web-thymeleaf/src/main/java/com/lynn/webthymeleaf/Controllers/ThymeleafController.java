package com.lynn.webthymeleaf.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {
    @RequestMapping("/index")
    public String test(Model model){
        model.addAttribute("content","Hello Thymeleaf");
        return "index";

    }
}