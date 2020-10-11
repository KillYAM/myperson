package com.itheima;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.itheima.mapper")
@EnableDubbo(scanBasePackages = "com.itheima.service.impl")
public class ProviderStarter {

    public static void main(String[] args) {
        SpringApplication.run(ProviderStarter.class,args);
    }
}
