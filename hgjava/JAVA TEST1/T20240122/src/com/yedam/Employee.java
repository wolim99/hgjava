package com.yedam;

// 사원 정보
// c = company
public class Employee {
	private String cno;
	private String cname;
	private String cphone;
	private String cday;
	private int cmonny;
	
	public Employee(String no, String name, String phone, String day, int monny) {
		this.cno = no;
		this.cname = name;
		this.cphone = phone;
		this.cday = day;
		this.cmonny = monny;
	}
	
	void showInfo() {
		System.out.printf("사번 %s 이름 %s 전화번호%s\n", this.cno, this.cname, this.cphone);
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	public String getCday() {
		return cday;
	}

	public void setCday(String cday) {
		this.cday = cday;
	}

	public int getCmonny() {
		return cmonny;
	}

	public void setCmonny(int cmonny) {
		this.cmonny = cmonny;
	}
	
}
