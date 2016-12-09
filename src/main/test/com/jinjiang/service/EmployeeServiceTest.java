package com.jinjiang.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by jerry.zhang on 2016/12/9.
 */
public class EmployeeServiceTest extends EmployeeService {
    @Test
    public void test1() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        //applicationContext.getBean(EmployeeService.class).test();
        EmployeeService employeeService = (EmployeeService)applicationContext.getBean("employeeService");
        employeeService.test();

    }

}