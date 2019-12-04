package com.shengsiyuan.springboot_mybatis1202.service;

import com.shengsiyuan.springboot_mybatis1202.bean.Dept;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class AmqpService {

    @RabbitListener(queues = "atguigu.news")
    public void  receive(Dept dept){
        System.out.println("receive"+dept);
    }

}
