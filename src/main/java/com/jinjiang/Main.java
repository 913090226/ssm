package com.jinjiang;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.jinjiang.domain.Employee;
import com.jinjiang.mapper.IEmployeeMapper;

/**
 * Created by jerry.zhang on 2016/12/9.
 */
public class Main {
    public static void main(String [] args) throws IOException{
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        //applicationContext.getBean(EmployeeService.class).test();
        EmployeeService employeeService = (EmployeeService)applicationContext.getBean("employeeService");
        employeeService.test();*/
    	
    	String resource = "mybatisCfg.xml";
    	InputStream inputStream = Resources.getResourceAsStream(resource);
    	SqlSession sqlSession = new SqlSessionFactoryBuilder().build(inputStream).openSession();
    	System.out.println(sqlSession);
    	String name1 = (String)sqlSession.selectOne("com.jinjiang.mapper.IEmployeeMapper.findNameByEmpNo","1");
    	
    	IEmployeeMapper employeeMapper = sqlSession.getMapper(IEmployeeMapper.class);
    	String name2 = employeeMapper.findNameByEmpNo("1");
    	
    	List<Employee> employees = employeeMapper.findAll();
    	
    	sqlSession.close();
    	System.out.println(name1+";"+name2);
    }
}
