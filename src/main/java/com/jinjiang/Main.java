package com.jinjiang;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jinjiang.domain.Employee;
import com.jinjiang.mapper.IDepartmentMapper;
import com.jinjiang.mapper.IEmployeeMapper;
import com.jinjiang.utils.JsonUtils;

/**
 * Created by jerry.zhang on 2016/12/9.
 */
public class Main {	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//SqlSession sqlSession = null;
		try {

			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
			// applicationContext.getBean(EmployeeService.class).test();
			IEmployeeMapper employeeMapper = (IEmployeeMapper) applicationContext.getBean("employeeMapper");
			System.out.println(employeeMapper);
			System.out.println(JsonUtils.objectToJson(employeeMapper.findAll()));

			/*
			 * String resource = "mybatisCfg.xml"; InputStream inputStream =
			 * Resources.getResourceAsStream(resource); sqlSession = new
			 * SqlSessionFactoryBuilder().build(inputStream).openSession();
			 * System.out.println(sqlSession); String name1 = (String)
			 * sqlSession.selectOne(
			 * "com.jinjiang.mapper.IEmployeeMapper.findNameByEmpNo", "1");
			 * 
			 * IEmployeeMapper employeeMapper =
			 * sqlSession.getMapper(IEmployeeMapper.class); String name2 =
			 * employeeMapper.findNameByEmpNo("1");
			 * 
			 * List<Employee> employees = employeeMapper.findAll(); String json
			 * = JsonUtils.objectToJson(employees);
			 * 
			 * System.out.println(name1 + ";" + name2 + ";" + json);
			 * 
			 * System.out.println(
			 * "----------------------------------------------------------------------"
			 * ); System.out.println(JsonUtils.jsonToListObject(json,
			 * Employee.class));
			 * 
			 * 
			 * System.out.println(
			 * "------------------------------------------------------------------------------"
			 * ); IDepartmentMapper departmentMapper =
			 * sqlSession.getMapper(IDepartmentMapper.class);
			 * System.out.println(departmentMapper.findAll());
			 */

		} catch (Exception e) {
		} finally {
			//sqlSession.close();
		}
	}
}
