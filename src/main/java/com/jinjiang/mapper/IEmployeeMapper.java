package com.jinjiang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jinjiang.domain.Employee;

public interface IEmployeeMapper {
	public String findNameByEmpNo(@Param("empno") String empno);
	
	public List<Employee> findAll();

}
