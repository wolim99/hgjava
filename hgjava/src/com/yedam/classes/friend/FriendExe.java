package com.yedam.classes.friend;

import java.util.Scanner;


import com.yedam.classes.Student;

public class FriendExe {
	public static void main(String[] args) {
		// 메뉴: 1.등록 2.목록 3.수정 4.삭제 9.종료
		// 사용자의 입력/ 처리결과 콘솔출력.
		FriendApp app = new FriendApp();
		UserApp uapp = new UserApp();

		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (true) {
			System.out.println("id>>>");
			String id = scn.nextLine();
			System.out.println("pw>>>");
			String pw = scn.nextLine();

			User user = uapp.login(id, pw);

			if (user != null) {
				System.out.printf("%s 님, 환영합니다\n", user.getName());
				break;
			}
			System.out.println("id와 pw를 확인해주세요!!");
		}

		String fname = "";
		String ftel = "";
		int fage = 0;

		while (run) {
			System.out.println("1.등록 2.목록 3.수정 4.삭제 9.종료");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 등록
				System.out.println("이름>>>");
				fname = scn.nextLine();
				System.out.println("전화번호>>>");
				ftel = scn.nextLine();
				System.out.println("나이>>>");
				fage = Integer.parseInt(scn.nextLine());

				Friend ftd = new Friend(fname, ftel, fage);

				if (app.add(ftd)) {
					System.out.print("등록완료!!!!\n");
				} else {
					System.out.println("등록실패 ㅠㅜ");
				}
				break;
			case 2: // 목록
				Friend[] list = app.list();
				for (int i = 0; i < list.length; i++) {
					if (list[i] != null) {
						list[i].showInfo();
					}
				}
				System.out.println("조회완료!!!");
				break;
			case 3: // 수정
				System.out.println("수정할 친구이름>>>");
				fname = scn.nextLine();

				if (app.modify(fname, ftel)) {
					System.out.println("수정완료!!");
				} else {
					System.out.println("모르는 친구입니다!!");
				}
				break;
			case 4: // 삭제
				System.out.println("삭제할 친구이름");
				fname = scn.nextLine();
				if (app.remove(fname)) {
					System.out.println("삭제완료");
				} else {
					System.out.println("모르는 친구입니다");
				}
				break;
			case 9: // 종료
				run = false;
				System.out.println("종료 되었습니다.");
			}

		}
		scn.close();
	}
}
