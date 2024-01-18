package com.yedam.todo;

import java.util.Scanner;

public class Todo117 {
	public static void main(String[] args) {
		// 강사님 답안
		Scanner scn = new Scanner(System.in);

		String[] strAry = new String[6];
		int idx = 0;
		for (int i = 1; i < 3; i++) {
			System.out.println("이름>>>");
			strAry[idx++] = scn.nextLine();
			System.out.println("연락처>>>");
			strAry[idx++] = scn.nextLine(); // 0번방에서 바로 입력
		}
		for (int i = 0; i < strAry.length; i++) {
			if (i % 2 == 0) { // 이름출력
				System.out.println("이름: " + strAry[i]);
			} else {
				System.out.println("연락처: " + strAry[i]);
				System.out.println("===================");
			}
		}


	}

	public static void method01() {
		// 내 답안
		{
			Scanner scn = new Scanner(System.in);

			String[] names = new String[6];
			String[] contacts = new String[6];

			// 친구 3명의 이름과 연락처 입력
			for (int i = 0; i < 3; i++) {
				System.out.println((i + 1) + "번째 친구의 이름을 입력하세요:");
				names[i] = scn.nextLine();
				System.out.println((i + 1) + "번째 친구의 연락처를 입력하세요:");
				contacts[i] = scn.nextLine();
			}

			System.out.println("입력완료.\n");

			// 입력받은 정보 출력
			for (int i = 0; i < 3; i++) {
				System.out.println("이름 : " + names[i]);
				System.out.println("연락처: " + contacts[i]);
				System.out.println("===================");
			}

			scn.close();
		}
	}
}