package com.github.zhenglc.ag.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 11:45 2018/6/21
 * @Modified By:
 * @Version:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(EurekaBootstrap.class,args);
    }
}
