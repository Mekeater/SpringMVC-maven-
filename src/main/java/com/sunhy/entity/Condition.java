package com.sunhy.entity;

import java.util.List;

/**
 * Created by Mekeater on 2018/5/4.
 */
//Condition实体类
public class Condition {
    private Integer deptno;
    private Double salary;
    private List<Integer> empnos;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<Integer> getEmpnos() {
        return empnos;
    }

    public void setEmpnos(List<Integer> empnos) {
        this.empnos = empnos;
    }
}
