package com.yedam.phonebook;

import java.util.Scanner;

// 연락처 app
public class PhoneBookApp {

	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.getInstance();
		Scanner scn = new Scanner(System.in);
		// 사용자권한 체크
		// UserManager => userCheck(아이디, 비번)
		// 3번 연속으로 인증이 실패할 경우 프로그램 종료
		
		manager.login();
		
		int menu = 1;

		while (true) {
			try {
				MenuViewer.showMenu();
				menu = MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();

				if (menu < InitMenu.INPUT || menu > InitMenu.EXIT) {
					throw new MenuChoiceException(menu); // 고의적으로 예외를 발생일으킬때는 throw new 사용
				}

				if (menu == InitMenu.INPUT) {
					manager.inputData();
				} else if (menu == InitMenu.SEARCH) {
					// manager.searchData();
				} else if (menu == InitMenu.DELETE) {
					manager.deleteData();
				} else if (menu == InitMenu.EXIT) {
					manager.storeToFile();
					break;
				}
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
				// System.out.println(e.getMessage()); // MenuChoiceException에서 super를 사용할때
			}
		}

		System.out.println("end of prog");
	}
}
