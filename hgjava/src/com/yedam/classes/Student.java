package com.yedam.classes;

// 학생번호, 이름, 점수, 키:
// 소개(학생번호, 이름, 점수)
public class Student { // private - 외부 클래스는 접근이 불가능
	// 필드
	private String sno; // null.
	private String sname;
	private int score; // 0
	private double height; // 0.0
	private boolean onSchool;

	// 생성자: 기본생성자. new Friend()
	public Student() {

	}

	public Student(String no, String name) { // 학생번호, 이름
		sno = no;
		sname = name;
	}

	public Student(String no, String name, int score) { // 이미 정의가 되있으면 묶는게 가능 학생번호, 이름을 점수
		this(no, name);
		this.score = score;
	}

	public Student(String no, String name, int score, double height) { // 학생번호, 이름
		this.sno = no;
		this.sname = name;
		this.score = score;
		this.height = height;
	}

	// 메소드 - 반환되는 값이 무조건있어야 함
	public void showInfo() { // private, public, protected 없으면 기본적으로 default로 접근
		System.out.printf("학생번호는 %s, 이름은 %s, 점수는 %d점 입니다.\n", this.sno, this.sname, this.score);
	}

	String showInfoStr() {
		return "번호는" + sno;
	}

	// getter/setter.
	// 학생 번호 S / G
	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSno() {
		return this.sno;
	}

	// 학생 이름 S / G
	public void setSname(String name) {
		this.sname = name;
	}

	public String getSname() {
		return this.sname;
	}

	// 학생 점수 S / G
	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return this.score;
	}

	// 학생 키 S / G
	public void setHeight(double height) {
		if (height < 0) {
			this.height = 160;
		} else {
			this.height = height;
		}
	}

	public double getHeight() {
		return this.height;
	}

	public boolean isOnSchool() {
		return onSchool;
	}

	public void setOnSchool(boolean onSchool) {
		this.onSchool = onSchool;
	}
	
	
}
