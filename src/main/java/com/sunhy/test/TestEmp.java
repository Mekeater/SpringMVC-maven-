package com.sunhy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sunhy.dao.EmpDao;
import com.sunhy.entity.Condition;
import com.sunhy.entity.Emp;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Mekeater on 2018/5/4.
 */

public class TestEmp {
    /*
    查询全部
    */
    public void test() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("mvc-dispatcher-servlet.xml");
        EmpDao dao=ctx.getBean(EmpDao.class);
        List<Emp> list=dao.findAll();
        for (Emp e :list)
        {
            System.out.println(e.getEmpno()+" "+e.getEname()+""+e.getJob());
        }
    }
    /*
    根据部门查询
    * */
    public void  Testfind()
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("mvc-dispatcher-servlet.xml");
        EmpDao dao = ctx.getBean(EmpDao.class);
        Condition condition=new Condition();
        condition.setDeptno(10);
        List<Emp> list=dao.findByDept(condition);
        for (Emp emp : list) {
            System.out.println(emp.getEname() + " " + emp.getJob());
        }
    }
    /**
     * 查询大于当前收入的员工
     */
    public void testfindbysalary() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        EmpDao dao = ctx.getBean(EmpDao.class);
        Condition condition = new Condition();
        condition.setSalary(4000.0);
        List<Emp> list = dao.findBySalary(condition);
        for (Emp emp : list) {
            System.out.println(emp.getDeptno() + " " + emp.getJob() + " " + emp.getMgr());
        }
    }
    /**
     * 查询当前部门下，大于当前收入的员工
     */
    public void testfindByDeptAndSalary() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao dao = context.getBean(EmpDao.class);
        Condition condition = new Condition();
        condition.setDeptno(20);
        condition.setSalary(2000.0);
        List<Emp> list = dao.findByDeptAndSalary(condition);
        for (Emp emp : list) {
            System.out.println(emp.getEname() + " " + emp.getEname());
        }
    }
    /**
     * 更新员工信息
     */
    public void testupdate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao dao = context.getBean(EmpDao.class);
        Emp emp = new Emp();
        emp.setEmpno(14);
        emp.setEname("Tom");
        dao.update(emp);
    }
    /**
     * 根据id查询
     */
    public void testFindById() {
        ApplicationContext axt = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao dao = axt.getBean(EmpDao.class);
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(3);
        ids.add(10);
        Condition cond = new Condition();
        cond.setEmpnos(ids);
        List<Emp> list = dao.findById(cond);
        for (Emp emp : list) {
            System.out.println(emp.getEname() + " " + emp.getDeptno());
        }
    }
}
