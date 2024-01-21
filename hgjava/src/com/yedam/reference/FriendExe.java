package com.yedam.reference;

import java.util.Scanner;

// 친구의 정보를 저장하고 변경하고...관리
// Create, Read, Update, Delete.
public class FriendExe {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		Friend[] friends = new Friend[5]; // {null, null, null, null, null}

		double weight = 0;
		int score = 0;
		while (run) {
			System.out.println("1.등록 2.조희 3.수정 4.삭제 5.점수조회 6.분석 9.종료");
			// 5. 입력점수 이상인 친구
			// 6. 평균점수 : 85, 최고점수: 90점
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 등록(Create)
				System.out.print("이름>>>");
				String name = scn.nextLine();
				System.out.print("몸무게>>>");
				weight = Double.parseDouble(scn.nextLine());
				System.out.println("점수>>>");
				score = Integer.parseInt(scn.nextLine());

				Friend friend = new Friend(); // 3개의 변수를 모두 넣기위한것
				friend.name = name;
				friend.weight = weight;
				friend.score = score;

				// 비어있는 위치 한건입력 종료.
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = friend;
						break;
					}
				}
				System.out.println("정상적으로 입력이 되었습니다.");
				break;
			case 2: // 조회(Read)
				// 전체목록 이름: 홍길동, 몸무게:77.2kg, 점수: 80점.
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						System.out.printf("%s의 몸무게는 %.1fKg 점수는 %d점입니다.\n", friends[i].name, friends[i].weight,
								friends[i].score);
					}
				}
				break;
			case 3: // 수정(Update)
				// 친구이름 -> 점수 수정.
				weight = -1;
				score = -1;
				System.out.print("조회할 이름>>>");
				name = scn.nextLine();
				System.out.print("수정 몸무게>>>");
				String sweight = scn.nextLine();
				if (!sweight.equals("")) {
					weight = Double.parseDouble(sweight);
				}
				System.out.println("수정 점수>>>");
				String sscore = scn.nextLine();
				if (!sscore.equals("")) {
					score = Integer.parseInt(sscore);
				}
				// 존재여부 체크.
				boolean isExist = false;
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && friends[i].name.equals(name)) {
						friends[i].score = (score != -1) ? score : friends[i].score;
						friends[i].weight = (weight != -1) ? weight : friends[i].weight;
						isExist = true;
					}
				}
				if (!isExist) {
					System.out.printf("친구목록에 없습니다 \n");
				}
				System.out.println("수정이 완료 되었습니다.");

				break;
			case 4: // 삭제
				System.out.print("삭제할 이름>>>");
				name = scn.nextLine();
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && friends[i].name.equals(name)) {
						friends[i] = null;
						break;
					}
				}
				System.out.println("삭제 완료 되었습니다.");

				break;
			case 5: // 점수조회 - 입력점수 이상인 친구
				System.out.println("몇점 이상을 찾으시나요?");
				int lll = Integer.parseInt(scn.nextLine());
				int cnt = 0;
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && friends[i].score >= lll) {
						cnt += friends[i].score;
						System.out.printf("이 넘는 사람은 %s 점수는 %d점입니다.\n", friends[i].name, friends[i].score);
					}
				}
				if (cnt == 0) {
					System.out.println(" 넘는 사람이 아무도 없습니다.");
				}
				break;
			case 6: // 분석 - 평균점수 : 85, 최고점수: 90점
				double avg = 0;
				int sum = 0;
				int max = 0;
				int cnt1 = 0; // 실제 정보가 저장된 요소의 수를 세는 변수

				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) { // null이 아닌 요소에 대해서만 처리
						sum += friends[i].score;
						cnt1++; // 정보가 있는 수를 센다
						if (max < friends[i].score) {
							max = friends[i].score;
						}
					}
				}

				if (cnt1 > 0) {
					avg = (double) sum / cnt1; // 실제 정보가 있는 수로 평균 계산
					System.out.printf("학생들의 총점: %d 이고 평균: %.1f 최고 점수: %d입니다\n", sum, avg, max);
				} else {
					System.out.println("등록된 친구 정보가 없습니다.");
				}
				break;
			case 9: // 종료(Exit)
				run = false;
				System.out.println("종료합니다.");

			} // end of case
		} // end of while
		System.out.println("end of prog");
	} // end of main
}