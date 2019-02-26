package com.lyw.eurekaljt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaLjtApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaLjtApplication.class, args);
    }

}
