package com.yedam;

import java.util.Scanner;

// 컨트롤러 App
public class EmpDAO {
Scanner scn = new Scanner(System.in);
	private Employee[] employees;

	public EmpDAO() {
		employees = new Employee[10];
	}
	// 등록
	public boolean add(Employee ctd) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] == null) {
				employees[i] = ctd;
				return true;
			}
		}
		return false;
	}

	// 목록
	public Employee[] list() {
		return employees;
	}

	// 수정
	public boolean modify(String cno, int cmonny) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && employees[i].getCno().equals(cno)) {
				employees[i].getCmonny();
				return true;
			}
		}
		return false;
	}

	// 삭제
	public boolean remove(String sno) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && employees[i].getCno().equals(sno)) {
				employees[i] = null;
				return true;
			}
		}
		return false;
	}

	public Employee get(String cday) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && employees[i].getCday().equals(cday)) {
				return employees[i];
			}
		}
		return null;
	}

}
