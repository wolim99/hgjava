package com.yedam.io.emp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmpExe {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		EmpApp app = new EmpApp();

		while (run) {
			System.out.println("1.등록 2.목록 9.종료");
			System.out.println("선택>>");

			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1: // "사원번호 이름 입사일자 급여" yy-MM-dd

				String input = scn.nextLine();
				String[] inputs = input.split(" ");
				Employee emp = new Employee(0, " ", new Date(), 0);
				SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
				
				
				if (app.add(emp)) {
					System.out.println("등록완료");
				} else {
					System.out.println("등록에러");
				}
				break;
			case 2:
				List<Employee> list = app.List();
				for (Employee std : list) {
					System.out.println(std.toString());
				}
				break;
			case 9:
				System.out.println("프로그램 종료");
				app.save();
				run = false;
			}
		}
	}
}
