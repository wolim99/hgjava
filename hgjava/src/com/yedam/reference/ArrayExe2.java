package com.yedam.reference;

import java.util.Scanner;

public class ArrayExe2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String[] friends = { "홍길동", "김민수", "박석민", "최홍만", "김길동" };
		double[] dblAry = { 67.3, 72.5, 88.3, 79.3, 90.4 };
		int [] scores = new int[5];
		scores[0] = 78;
		scores[1] = 82;
		scores[2] = 95;
		scores[3] = 90;
		scores[4] = 85;
		
		// 최고점수를 계산하기 위한 변수.
		int max = 0;
		String name= "";
		double weight = 0;
		for (int i = 0; i< scores.length; i++) {
			if (max < scores[i]) {
				name = friends[i];
				weight = dblAry[i];
				max = scores[i];
			}
		}
		System.out.printf("최고점수 이름: %s, 몸무게: %.1f", name, weight, max);

		
	}

	public static void method1() {
		int[] scores = new int[10];
		scores[3] = 40;
		scores[7] = 50;

		// 새로운 배열을 만들었기때문에 초기화
		scores = new int[5];
		scores[0] = 78;
		scores[1] = 82;
		scores[2] = 77;
		scores[3] = 90;
		scores[4] = 85;
		// "90점 이상이 학생은 ?명입니다."
		// "90점 이상학생은 없습니다
		int cnt = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 90) {
				cnt++;
			}
			System.out.println("scores[" + i + "]=> " + scores[i]);
		}
		if (cnt >= 0) {
			System.out.printf("90점 이상인 학생: %d 명 입니다.", cnt);
		} else {
			System.out.printf("90점 이상학생은 없습니다.");
		}

		System.out.println("\nend of prog");
	}

	public static void method2() {

		double[] dblAry = { 67.3, 72.5, 88.3, 79.3, 90.4 };
		double avg = 0;
		double sum = 0; // total 값을 구하기위한 방
		// 친구의 평균 몸무게는 78.8 입니다.

		for (int i = 0; i < dblAry.length; i++) {
			sum += dblAry[i];
		}
		avg = sum / dblAry.length;
		System.out.printf("친구의 평균 몸무게: %.1f 입니다", avg);

	}

	public static void method3() {
		double[] dblAry = { 67.3, 72.5, 88.3, 79.3, 90.4 };
		// 배열의 값 중에서 제일 큰값을 출력.
		double min = 67.3;
		double max = 0;
		for (int i = 0; i < dblAry.length; i++) {
			if (min > dblAry[i]) {
				min = dblAry[i];
			}
			if (max < dblAry[i]) {
				max = dblAry[i];
			}
		}
		System.out.printf("최대값은 %.1f 입니다\n최소값은 %.1f 입니다", max, min);
	}
	public static void method4() {
		Scanner scn = new Scanner(System.in);

		System.out.println("친구입력>>>");
		String name = scn.nextLine();
		
		String[] friends = { "홍길동", "김민수", "박석민", "최홍만", "김길동" };
		// 김민수는 2번째 있습니다. 
		
		boolean isExist = false;
		for(int i=0; i<friends.length; i++) {
			if(friends[i].equals(name)) {
				System.out.printf("%s는 %d번째에 있습니다",name,i+1);	
				isExist = true;
			}
		}
		if(!isExist){
			System.out.println("찾는 친구가 없습니다.");
		}
	}
}
