package com.shengsiyuan.springboot_mybatis1202;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
@EnableRabbit
@EnableAsync
@EnableScheduling
public class SpringbootMybatis1202Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatis1202Application.class, args);
    }

}
