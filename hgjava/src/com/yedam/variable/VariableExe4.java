package com.yedam.variable;


import java.util.Scanner;

import javax.swing.plaf.basic.BasicLookAndFeel;

public class VariableExe4 {
	public static void main (String[] args) {
		// true / false.
		boolean isTrue = true; // 10 > 20;
		
		isTrue = update(10);
		
		if (isTrue) {
			System.out.println("참값.");
		} else {
			System.out.println("거짓값.");
		}
		
		Member m1 = new Member();
		m1.name = "홍길동";
		m1.age = 20;
		m1.height = 168.7;
		System.out.println(" 이름 " + m1.name +" "+ m1.age + " 세" + " 키" + m1.height + "입니다");
		
		Member m2 = new Member();
		m2.name = "김민수";
		m2.age = 20;
		m2.height = 173.5;
		
		isTrue = m1.height > m2.height;
		isTrue = m1.age == m2.age;
		isTrue = m1 == m2; // 이름 나이 키 가 전부같더라도 false로 대답 
						   // 이유 서로 다른객체 다른 주소값을 가지고있기 때문에
		
		System.out.println(m1);
		System.out.println(m2);
		
		// 강제로 type 변경
		byte a = 10;
		int b = a; // 자동으로(int)로 형변환
		
		double d1 = 10.0;
		double result = d1 + (double)20.0f;		
		
		int sum = 60;
		result = sum * 1.0 / 7; //80.0
		System.out.println(result);
		
		sum = Integer.parseInt("1") + 3 + 5;
		
		result = Double.parseDouble("1.234") + 2.3;
		
	} // end of main
	
	public static boolean update(int arg) {
		return arg % 2 == 0;  // 짝수면 true 홀수면 false
	} // end of update.
}// end of class.
