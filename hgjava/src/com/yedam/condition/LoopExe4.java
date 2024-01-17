package com.yedam.condition;


import javax.swing.Spring;

public class LoopExe4 {
	public static void main(String[] args) {
		// i,j =>
		for(int i = 4; i > 0; i--) {
			// start
			for(int j = 1; j <= i; j++) {
				System.out.printf("★");
			}// end.
			System.out.println();
		}
	}

//	public static void method1(String[] args) {
//
//		for (int j = 1; j <= 9; j++) {
//			// 시작
//			for (int i = 2; i <= 9; i++) {
//				System.out.printf(i + " * " + j + " = " + j * i + "\t");
//			}
//			System.out.println();
//			// 끝
//		}
//
//	}
//	public static void method2(String[] args) {
//		for (int i=1; i<=9; i++) {
//			for(int j=2; j<=9; j++) {
//				System.out.printf("%2d * %d = %d ", i, j, (j * i),"\t");
//			}
//			System.out.println();
//		}
//	}

}
