package com.shengsiyuan.springboot_mybatis1202.mapper;

import com.shengsiyuan.springboot_mybatis1202.bean.Dept;
import com.shengsiyuan.springboot_mybatis1202.bean.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpDeptMapper {

//    查看每个员工的员工信息与所属部门信息
    public List<Emp> selectEmpDept();

// 查询每个部门的员工信息
    public List<Dept> selectDeptEmp();

}
