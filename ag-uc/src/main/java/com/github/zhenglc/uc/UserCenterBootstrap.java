package com.github.zhenglc.uc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 13:17 2018/6/21
 * @Modified By:
 * @Version:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class UserCenterBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(UserCenterBootstrap.class, args);
    }
}
