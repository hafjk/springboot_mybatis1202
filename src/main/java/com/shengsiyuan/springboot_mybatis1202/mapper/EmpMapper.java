package com.shengsiyuan.springboot_mybatis1202.mapper;

import com.shengsiyuan.springboot_mybatis1202.bean.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface EmpMapper {

    public Emp selectEmpById(Integer id);

    public List<Emp> selectAllEmp();

    public Emp selectEmpByName(String name);

    public List<Emp> selectEmpByEmp(Emp emp);

    public List<Emp> selectEmpByIds(HashMap map);

}
