package com.yedam.condition;


import java.util.Scanner;

public class WhileLoopExe2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 어떤 조건일 동안 반복.
		int random = (int) (Math.random() * 100) + 1; // 1 ~ 10 정수.
		while(true) {
			System.out.println("값입력>>>");
			int val = scn.nextInt();
			if(random == val) {
				System.out.printf("임의값 %d \n", random);
				break;
			} if (random > val) {
				System.out.println("좀더 큽니다");
				continue;							// 입력값이 안맞으면 continue문을 만나서 다시올라감
			}
				System.out.println("좀더 작습니다"); 
		}
		System.out.println("end of prog");
	}
}
