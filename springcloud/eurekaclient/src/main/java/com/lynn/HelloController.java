package com.lynn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RefreshScope
@RestController
public class HelloController {

    @Value("${server.port}")
    private int port;

    @RequestMapping("index")
    public String index(){
        return "Hello World!,端口："+ port;
    }

    private String profile;

    @GetMapping("/hello")
    public Mono<String> hello(){
        return Mono.justOrEmpty(profile);

    }

    /*@Value("${foo}")
    String foo;

    @RequestMapping("/foo")
    public String hi(){
        return foo;
    }*/
}
