package com.yedam.operater;

import java.util.Scanner;

// 은행계좌. 55000 - 50000 최대 금액 10만원 계좌 하나뿐임
public class BankExe {
	public static void main(String[] args) {
		// 입금, 출금, 잔고, 종료.
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		boolean run = true;

		while (run) {
			System.out.println("1.입금 2.출금 3.잔고 4.종료");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				System.out.println("입금액>>>");
				int val = Integer.parseInt(scn.nextLine());
				if (balance + val > 100000) {
					System.out.println("입금액 초과!!");
					break;
				}
				balance += val;
				System.out.println("저장성공!");
				break;
			case 2:
				System.out.println("출금액>>>");
				val = Integer.parseInt(scn.nextLine());
				if (balance < val) {
					System.out.println("잔액 부족합니다.");
					break;
				}
				balance -= val;
				System.out.println("저장성공.");
				break;
			case 3:
				System.out.printf("잔액 %d\n", balance);
				System.out.println(balance);
				break;
			case 4:
				System.out.println("이용을 종료합니다.");
				run = false;
				break;
			}
		}
		System.out.println("end of prog");
		scn.close();
	}
}
