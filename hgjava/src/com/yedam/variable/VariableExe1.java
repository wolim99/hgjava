package com.yedam.variable;


import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class VariableExe1 {
	public void sum() {
		int n2;
	}
	public static void main(String[] arg) {
		// let n = '10'; 
		// const obj = {name:"홍길동", age:20, showInfo(){ } }
		int n1 = 2147483647; // int(기본데이터타입) wrapper클래스 : Integer.
		n1 = -2147483648;
		System.out.println(Integer.MAX_VALUE);
		
		long n2 = 2147483647L;
		n2 = -2147483648L;
		
		double n3 = Math.random(); // 0 ~ 1임의실수.
		
		int n4 = (int)(Math.random()* 10); // 0 ~ 10 임의실수.
		
		String str = "홍길동";
		
//		int n2; 두번 선언이 불가.
		byte b1 = 127; // 2의 7승까지 8bit
		System.out.println(Short.MAX_VALUE);
		short s1 = 32767;
		
		short s3 =(short)(s1 - 30); // int
		// 왼쪽항 = 오른쪽항 : 항상 타입이 동일해야한다.
		double d1 = (double) 40;
	}
}

