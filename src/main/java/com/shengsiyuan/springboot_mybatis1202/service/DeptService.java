package com.shengsiyuan.springboot_mybatis1202.service;

import com.shengsiyuan.springboot_mybatis1202.bean.Dept;
import com.shengsiyuan.springboot_mybatis1202.bean.Emp;

public interface DeptService {

    public Dept findDeptById(Integer id);

    public Dept updateDept(Dept dept);

    public void deleteDeptById(Integer id);

    public void addEmp(Dept dept);
}
