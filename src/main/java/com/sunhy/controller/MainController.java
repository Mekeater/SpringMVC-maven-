package com.sunhy.controller;

import com.sunhy.dao.EmpDao;
import com.sunhy.entity.Emp;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Mekeater on 2018/5/2.
 */
@Controller
@RequestMapping(value = "/hello", method = RequestMethod.GET)
public class MainController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        return "test";
    }

/*    @Resource*/
    private EmpDao empDao;
    public void setEmpDao(EmpDao empDao)
    {
        this.empDao = empDao;
    }
    @RequestMapping("/findEmp.do")
    public String find(Model model) {
        List<Emp> list = empDao.findAll();
        model.addAttribute("emps", list);
        return "emp_list";
    }
}
