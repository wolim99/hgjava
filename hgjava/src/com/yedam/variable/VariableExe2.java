package com.yedam.variable;


import java.util.Scanner;

public class VariableExe2 {
	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력 >>> ");
		String name = scn.nextLine();
		System.out.println("연락처를 입력 >>>");
		String tel = scn.nextLine();
		
		// 영어 (=eng), 수학 (=math), => 학계(=sum) : scn.nextInt()
		System.out.println("영어 입력>>>");
		int eng = scn.nextInt();
		System.out.println("수학 입력>>>");
		int math = scn.nextInt();
		int sum = eng + math;
		
		System.out.println("이름: "+ name +", 연락처" + tel);
		System.out.println("영어: " + eng + " 수학: " + math + " = " + sum);
	}
}