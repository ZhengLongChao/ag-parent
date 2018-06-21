package com.github.zhenglc.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 14:04 2018/6/21
 * @Modified By:
 * @Version:
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableEurekaClient
@EnableConfigServer
public class ConfigBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(ConfigBootstrap.class, args);
    }
}
