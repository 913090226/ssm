package com.jinjiang;

import com.jinjiang.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jerry.zhang on 2016/12/9.
 */
public class Main {
    public static void main(String [] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        //applicationContext.getBean(EmployeeService.class).test();
        EmployeeService employeeService = (EmployeeService)applicationContext.getBean("employeeService");
        employeeService.test();
    }
}
