package com.shengsiyuan.springboot_mybatis1202.mapper;

import com.shengsiyuan.springboot_mybatis1202.bean.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {

    public Dept selectDeptById(Integer id);

    public List<Dept> SelectAllDept();

    void updateDept(Dept dept);

    public void insertDept(Dept dept);
    public void  deleteDept(Integer id);
}
