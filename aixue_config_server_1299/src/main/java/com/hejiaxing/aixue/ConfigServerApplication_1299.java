package com.hejiaxing.aixue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //加入注册中心
@EnableConfigServer  //启动配置中心服务端
public class ConfigServerApplication_1299 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication_1299.class);
    }
}
