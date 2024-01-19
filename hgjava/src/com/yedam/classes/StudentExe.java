package com.yedam.classes;

// 실행을 하기위한 클래스
public class StudentExe {

	public static void main(String[] args) {
		Student s1 = new Student("S001", "홍길동", 80, 178.9); // 인스턴스 생성. 생성자.
//		s1.sno = "S001";
//		s1.sname = "홍길동";
//		s1.score = 80;
//		s1.height = 178.9;

//		System.out.println(s1.sno); // 학생번호만 
//		s1.height = -167;
		s1.setHeight(-167);
		System.out.println(s1.getHeight());
		s1.showInfo();

		Student s2 = new Student("S002", "김길동");
//		s2.score = 85;
		s2.showInfo();

		Student s3 = new Student("S003", "박길동", 90);
		s3.showInfo();
	}
}
