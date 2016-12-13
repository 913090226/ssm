package com.jinjiang.mapper;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jinjiang.domain.Department;

@Service("departmentMapper")
public interface IDepartmentMapper {
	public List<Department> findAll();
}
