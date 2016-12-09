package com.jinjiang.domain;

import java.util.Date;
/**
 * Created by jerry.zhang on 2016/12/9.
 */
public class Employee {
    private Integer empNo;
    private String name;
    private Date hireDay;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer empNo, String name, Date hireDay, Double salary) {
        this.empNo = empNo;
        this.name = name;
        this.hireDay = hireDay;
        this.salary = salary;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", name='" + name + '\'' +
                ", hireDay=" + hireDay +
                ", salary=" + salary +
                '}';
    }
}
