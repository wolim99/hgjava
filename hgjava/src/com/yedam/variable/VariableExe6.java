package com.yedam.variable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class VariableExe6 {
	public static void main(String[] args) throws FileNotFoundException {
		// 표준입출력: 키보드(System.in), 모니터(System.out).
		InputStream is = new FileInputStream("test.txt");
		Scanner scn = new Scanner(is);

		String name = scn.nextLine();
		// 나이(int:age), 키(double:height)
		int age = Integer.parseInt(scn.nextLine());
		double height = Double.parseDouble(scn.nextLine());

		scn.close();
		// 이름은 홍길동, 나이는 20세, 키는 178.9 입니다.
		scn.close();
		String str = "이름은 %s, 나이는 %d세, 키는 %.1f 입니다.";
		System.out.printf(str, name, age, height);
	}
}
