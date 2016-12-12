package com.jinjiang;

import com.jinjiang.domain.Employee;
import com.jinjiang.mapper.IEmployeeMapper;
import com.jinjiang.service.EmployeeService;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    	//String name = sqlSession.selectOne("/ssm/src/main/resources/mapper/IEmployeeMapper.finaNameByEmpNo","1");
    	
    	IEmployeeMapper employeeMapper = sqlSession.getMapper(IEmployeeMapper.class);
    	String name = employeeMapper.finaNameByEmpNo("1");
    	System.out.println(name);
    }
}
