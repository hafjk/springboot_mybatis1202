package com.shengsiyuan.springboot_mybatis1202.bean;

import java.io.Serializable;
import java.util.List;

public class Dept implements Serializable {
    private Integer id;
    private String deptname;
    private Integer locadd;
    private Integer num;
    private List<Emp> listEmp;

    public List<Emp> getListEmp() {
        return listEmp;
    }

    public void setListEmp(List<Emp> listEmp) {
        this.listEmp = listEmp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public Integer getLocadd() {
        return locadd;
    }

    public void setLocadd(Integer locadd) {
        this.locadd = locadd;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", deptname='" + deptname + '\'' +
                ", locadd=" + locadd +
                ", num=" + num +
                ", listEmp=" + listEmp +
                '}';
    }
}
