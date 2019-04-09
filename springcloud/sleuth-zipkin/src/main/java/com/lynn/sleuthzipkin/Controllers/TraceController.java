package com.lynn.sleuthzipkin.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancerExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class TraceController {

    @Autowired
    private LoadBalancerExchangeFilterFunction lbFunction;

    @GetMapping("/trace-b")
    public Mono<String> TraceB(){
        System.out.println("======call trace b=======");
        return Mono.just("Trace b");
    }

    @Bean
    public WebClient webClient(){
        return WebClient.builder().baseUrl("http://trace-b").filter(lbFunction).build();
//        return WebClient.builder().baseUrl("http://localhost:8090/trace-b").build();
    }

    @GetMapping("/trace-a")
    public Mono<String> TraceA(){
        System.out.println("====call trace a=======");
        try {
            WebClient wc = webClient();

            if(wc == null)
                return Mono.just("WebClient is null");
            else
                return wc.get().uri("/trace-b").retrieve().bodyToMono(String.class);
        }
        catch(Exception ex)
        {
            return  Mono.just("挂掉了");
        }

    }
}
