package com.sunhy.dao;


import com.sunhy.entity.Condition;
import com.sunhy.entity.Emp;
import java.util.List;

/**
 * Created by Mekeater on 2018/5/4.
 */
//编写Dao接口
public interface EmpDao {
    public List<Emp> findAll(); // 查询全部
    public List<Emp> findByDept(Condition cond); // 根据部门查询
    public List<Emp> findBySalary(Condition cond); // 大于当前工资
    public List<Emp> findByDeptAndSalary(Condition cond); // 查询当前部门下，大于当前收入的员工
    public void update(Emp emp);// 更新员工信息
    public List<Emp> findByDeptAndSalary2(Condition cond); // 查询当前部门下，大于当前收入的员工
    public void update2(Emp emp);// 更新员工信息
    public List<Emp> findById(Condition cond); // 根据id查询
}
