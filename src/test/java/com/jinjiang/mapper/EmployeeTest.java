package com.jinjiang.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jinjiang.utils.JsonUtils;

@ContextConfiguration(locations={"classpath:application.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeTest {
	@Autowired
	private IEmployeeMapper employeeMapper ;

	@Test
	public void test() {
		System.out.println(employeeMapper.findAll());
		System.out.println("------------------------------------------------------------------");
		System.out.println(JsonUtils.objectToJson(employeeMapper.findAll()));
	}

}
