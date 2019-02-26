package com.lyw.servicefilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@ServletComponentScan("com.lyw.servicefilter.filter")
public class ServiceFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFilterApplication.class, args);
    }

}
