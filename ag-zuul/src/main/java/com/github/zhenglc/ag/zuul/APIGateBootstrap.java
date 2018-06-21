package com.github.zhenglc.ag.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 13:04 2018/6/21
 * @Modified By:
 * @Version:
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableEurekaClient
public class APIGateBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(APIGateBootstrap.class, args);
    }
}
