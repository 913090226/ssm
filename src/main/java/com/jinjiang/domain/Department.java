package com.jinjiang.domain;

public class Department {
	private Integer deptNo;
	private String name;

	public Department() {
		super();
	}

	public Department(Integer deptNo, String name) {
		super();
		this.deptNo = deptNo;
		this.name = name;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", name=" + name + "]";
	}

}
