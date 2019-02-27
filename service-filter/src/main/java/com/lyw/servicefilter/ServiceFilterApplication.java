package com.lyw.servicefilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@EnableEurekaClient
@ServletComponentScan("com.lyw.servicefilter.filter")
@ComponentScan(basePackages = "com.lyw.servicefilter")
public class ServiceFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFilterApplication.class, args);
    }

}
