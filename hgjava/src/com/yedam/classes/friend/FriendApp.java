package com.yedam.classes.friend;

import com.yedam.classes.Student;

// 등록기능, 수정기능, 삭제기능, 목록, 단건조회
public class FriendApp {
	// 필드: 친구정보를 저장할 수 있는 배열
	private Friend[] friends;

	public FriendApp() {
		friends = new Friend[10];
	}

	// 등록
	public boolean add(Friend ftd) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = ftd;
				return true;
			}
		}
		return false;
	}

	// 목록
	public Friend[] list() {
		return friends;
	}

	// 수정
	public boolean modify(String fname, String tel) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getFname().equals(fname)) {
				friends[i].setFtel(tel);
				return true;
			}
		}
		return false;
	}

	// 삭제
	public boolean remove(String name) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getFname().equals(name)) {
				friends[i] = null;
				return true;
			}
		}
		return false;
	}

}
