package com.yedam.phonebook;

// 기능 c:/temp/userList.txt 에 저장된 아이디/비번을 이용
public class UserManager {
	private static final String CORRECT_USERNAME = "id";
	private static final String CORRECT_PASSWORD = "pw";
	private static int cnt = 0;

	public static boolean userCheck(String username, String password) {
		if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
			cnt = 0;
			return true;
		} else {
			cnt++;
			if (cnt >= 3) {
				System.out.println("3번 연속으로 인증 실패하였습니다. 프로그램을 종료합니다.");
				System.exit(0);
			}
			System.out.println("인증 실패. 남은 시도 횟수: " + (3 - cnt));
			return false;
		}
	}
}
