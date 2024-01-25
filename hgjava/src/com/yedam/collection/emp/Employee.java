package com.yedam.collection.emp;

import java.util.Date;

// empNo, empName, hireDate, salary
public class Employee {
	private int empNo;
	private String empName;
	private Date hireDate;
	private int salary;

	public Employee(int empNo, String empName, Date hireDate, int salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.hireDate = hireDate;
		this.salary = salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", hireDate=" + hireDate + ", salary=" + salary
				+ "]";
	}

}
