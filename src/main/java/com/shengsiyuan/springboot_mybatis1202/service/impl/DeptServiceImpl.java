package com.shengsiyuan.springboot_mybatis1202.service.impl;

import com.shengsiyuan.springboot_mybatis1202.bean.Dept;
import com.shengsiyuan.springboot_mybatis1202.bean.Emp;
import com.shengsiyuan.springboot_mybatis1202.mapper.DeptMapper;
import com.shengsiyuan.springboot_mybatis1202.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper deptMapper;

    @Cacheable(cacheNames = {"dept"},key = "#id")
    @Override
    public Dept findDeptById(Integer id) {
        Dept dept = deptMapper.selectDeptById(id);
        return dept;
    }

    @CachePut(cacheNames = {"dept"},key = "#dept.id")
    public Dept updateDept(Dept dept) {

        deptMapper.updateDept(dept);
        return dept;
    }

    @CacheEvict(cacheNames = {"dept"},key = "#id")
    public void deleteDeptById(Integer id) {
            deptMapper.deleteDept(id);
    }

    @Override
    public void addEmp(Dept dept) {
        deptMapper.insertDept(dept);
    }
}
