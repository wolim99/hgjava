package com.yedam.condition;

import java.util.Random;


public class ArrayExe {
	public static void main(String[] args) {
		// 
		int[] intAry = {10, 20, 30}; // int intAry
		intAry[2] = 40;
		
		intAry = new int[] {10, 20, 30, 40, 50};
		intAry = new int[10];
		
		System.out.println(intAry[0]+", 크기:" + intAry.length);
		intAry[0] = 100;
		// 배열에
		for(int i=0; i< 10; i++) {
			intAry[i] = (int)(Math.random() * 10);
		}
		// 2, 3의 배수의 값을 각각 int sum2, sum3에 저장
		
		int sum2, sum3;
		sum2 = sum3 = 0;
		for(int i = 0; i< 10; i++) {
			System.out.println(intAry[i]);
			if(intAry[i] % 2 == 0 && intAry[i] % 3 == 0) {
				sum2 += intAry[i];
				sum3 += intAry[i];
			} if (intAry[i] % 2 == 0) {
			// 코드작성 2,3 의 배수구분
				sum2 += intAry[i];
			} if (intAry[i] % 3 == 0) {
				sum3 += intAry[i];
			}
		}
		// 각각 출력
		System.out.printf("2의배수합: %d, 3의배수합: %d", sum2, sum3);
		System.out.printf("");
		
		// 문자열 배열.
//		String[] strAry = {"Hong", "Park", "Kim"}; // String strAry
//		for(int i=0; i<strAry.length; i++) {
//			System.out.println(strAry[i]);
//		}
		
	}
}
