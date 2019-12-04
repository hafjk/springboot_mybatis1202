package com.shengsiyuan.springboot_mybatis1202.controller;

import com.shengsiyuan.springboot_mybatis1202.bean.Dept;
import com.shengsiyuan.springboot_mybatis1202.bean.Emp;
import com.shengsiyuan.springboot_mybatis1202.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class DeptController {
    @Autowired
    DeptService deptService;

    @GetMapping("/findDeptById/{id}")
    public Dept findDeptById(@PathVariable("id") Integer id){
        Dept dept = deptService.findDeptById(id);
        return dept;
    }

    @GetMapping("/updateDept")
    public String updateDept(Dept dept){
        deptService.updateDept(dept);
        return "success";
    }

    @GetMapping("/insertDept")
    public String insertDept(Dept dept){
        deptService.addEmp(dept);
        return "success";
    }
    @GetMapping("/deleteDept/{id}")
    public String deleteDept(@PathVariable("id") Integer id){
        deptService.deleteDeptById(id);
        return "delete";
    }

}
