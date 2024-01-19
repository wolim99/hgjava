package com.yedam.classes.friend;

// 친구이름, 연락처, 나이: 관리
public class Friend {
	private String fname;
	private String ftel;
	private int fage;

	public Friend(String name, String tel, int age) {
		this.fname = name;
		this.ftel = tel;
		this.fage = age;
	}

	void showInfo() {
		System.out.printf("친구이름은%s 전화번호는 %s 나이는 %d", this.fname, this.ftel, this.fage);
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFtel() {
		return ftel;
	}

	public void setFtel(String ftel) {
		this.ftel = ftel;
	}

	public int getFage() {
		return fage;
	}

	public void setFage(int fage) {
		this.fage = fage;
	}

}
