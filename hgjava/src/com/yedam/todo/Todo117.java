package com.yedam.todo;


import java.util.Scanner;

public class Todo117 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String[] names = new String[3];
        String[] contacts = new String[3];

        // 친구 3명의 이름과 연락처 입력
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "번째 친구의 이름을 입력하세요:");
            names[i] = scn.nextLine();
            System.out.println((i + 1) + "번째 친구의 연락처를 입력하세요:");
            contacts[i] = scn.nextLine();
        }

        System.out.println("입력완료.\n");

        // 입력받은 정보 출력
        for (int i = 0; i < 3; i++) {
            System.out.println("이름 : " + names[i]);
            System.out.println("연락처: " + contacts[i]);
            System.out.println("===================");
        }

        scn.close();
    }

}