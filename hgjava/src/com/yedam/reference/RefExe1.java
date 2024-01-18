package com.yedam.reference;

public class RefExe1 {
	public static void main(String[] args) {
		int n1 = 100;
		int n2 = 100;
		System.out.println(n1 == n2); // 결과는 True 값을 비교
		
		String str1 = new String("홍길동"); 
		String str2 = new String("홍길동");
		System.out.println(str1 == str2); // 결과는 false 주소값이 다르기때문
		System.out.println(str1.equals(str2)); // 결과는 True equals로 비교하기 때문에
		
		int[] intAry = new int[10];
		intAry = null;
		System.out.println(intAry[0]); 
		
	}
}
