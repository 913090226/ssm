package com.jinjiang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.jinjiang.domain.Employee;

@Service("employeeMapper")
public interface IEmployeeMapper {
	public String findNameByEmpNo(@Param("empno") String empno);
	
	public List<Employee> findAll();

}
