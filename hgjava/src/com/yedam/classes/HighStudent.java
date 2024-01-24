package com.yedam.classes;

// 담임선생님
public class HighStudent extends Student {
	private String teacher;

	// 생성자
//	public HighStudent() {
//		super();
//	}

	public HighStudent(String sno, String name) {
		super(sno, name); // super = 부모의 가르침
	}

	public HighStudent(String sno, String name, int score, String teacher) {
		super(sno, name, score);
		this.teacher = teacher;
	}

	// Getter / Setter
	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	// 부모메소드를 재정의(overriding)
	public void showInfo() {
		// 자식클래스: teacher 추가 출력.
		System.out.printf("학생번호는 %s, 이름은 %s, 점수는 %d점, 선생님은 %s 입니다.\n", getSno(), getSname(), getScore(), teacher);

	}
}
