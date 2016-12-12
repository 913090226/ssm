package com.jinjiang.mapper;

import org.apache.ibatis.annotations.Param;

public interface IEmployeeMapper {
	public String findNameByEmpNo(@Param("empno") String empno);

}
