package com.gnq.usersearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author guonanqing
 * @version 1.0
 * @desc
 * @date 2020/12/4 13:55
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayRouterApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayRouterApplication.class, args);
    }
}
