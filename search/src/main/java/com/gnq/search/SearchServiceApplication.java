package com.gnq.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author guonanqing
 * @version 1.0
 * @desc
 * @date 2020/12/4 16:16
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.gnq.usersearch.user.*")
public class SearchServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SearchServiceApplication.class, args);
    }
}
