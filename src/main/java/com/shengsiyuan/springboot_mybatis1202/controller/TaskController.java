package com.shengsiyuan.springboot_mybatis1202.controller;

import com.shengsiyuan.springboot_mybatis1202.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/asoytest")
    public String asoytest(){
        taskService.asoytask();
        return "success task";
    }
}
