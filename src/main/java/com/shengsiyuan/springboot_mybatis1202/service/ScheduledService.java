package com.shengsiyuan.springboot_mybatis1202.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {

    @Scheduled(cron = "0 * * * * * ")
    public void ScheduledTest(){

        System.out.println("hello----------------");

    }
}
