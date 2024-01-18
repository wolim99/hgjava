package com.yedam.todo;

import java.util.Scanner;

public class Todo0116 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("값을 입력>>>");
			String input = scn.nextLine();

			// 입력값이 "quit"일 경우 프로그램 종료
			if (input.equals("quit")) {
				break;
			}
			System.out.printf("입력값은 %s 입니다", input);
			System.out.println();

			// 입력값 처리 (예: 홍길동 처리)
			// 여기서 입력값에 대한 추가적인 처리를 할 수 있습니다.
		}
		System.out.println("<< end of prog >>");
		scn.close();

	}

}