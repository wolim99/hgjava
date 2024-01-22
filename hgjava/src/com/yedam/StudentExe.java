package com.yedam;

import com.yedam.classes.Student;

public class StudentExe {
	public static void main(String[] args) {
		Student std = new Student("S001", "홍길동");
		std.setScore(80);
		
		std.showInfo(); // 접근 수준이 default이기 때문에 다른 패키지에서는 가져올수없음 -> public void로 하면 가능
	}
}
