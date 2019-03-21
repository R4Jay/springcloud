package com.lynn;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//EnableEurekaClient，标注了此注解，说明该项目是一个服务提供者。
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication  /*extends SpringBootServletInitializer*/ {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }*/
}