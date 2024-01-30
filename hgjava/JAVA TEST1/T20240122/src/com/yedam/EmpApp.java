package com.yedam;

import java.util.Scanner;

// MainExe
public class EmpApp {
	public static void main(String[] args) {

		// 메뉴: 1.등록 2.목록 3.수정(급여) 4.삭제 5.조회(조건:입사일자) 6.종료
		Scanner scn = new Scanner(System.in);
		EmpDAO app = new EmpDAO();
		boolean run = true;
		
		String cno = "";
		String cname = "";
		String cphone = "";
		String cday = "";
		int cmonny = 0;

		while (run) {
			System.out.println("1.등록 2.목록 3.수정(급여) 4.삭제 5.조회(조건:입사일자) 6.종료");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 등록
				System.out.print("사원번호>>");
				cno = scn.nextLine();
				System.out.println("이름입력>>");
				cname = scn.nextLine();
				System.out.println("전화번호입력>>");
				cphone = scn.nextLine();
				System.out.println("입사일입력>>");
				cday = scn.nextLine();
				System.out.println("급여입력");
				cmonny = Integer.parseInt(scn.nextLine());

				Employee ctd = new Employee(cno, cname, cphone, cday, cmonny);

				if (app.add(ctd)) {
					System.out.print("등록완료!!!!\n");
				} else {
					System.out.println("등록실패 ㅠㅜ");
				}
				break;
			case 2: // 목록
				Employee[] list = app.list();
				for (int i = 0; i < list.length; i++) {
					if (list[i] != null) {
						list[i].showInfo();
					}
				}
				System.out.println("조회완료!!!");
				break;
			case 3: // 수정
				System.out.println("수정할 사원의 번호와 바꿀급여를 적어주세요");
				cno = scn.nextLine();
				cmonny = Integer.parseInt(scn.nextLine());
				
				if (app.modify(cno, cmonny)) {
					System.out.println("수정완");
				} else {
					System.out.println("등록되어있지 않은 사원입니다.");
				}
				break;
			case 4: // 삭제
				System.out.println("삭제할 사원번호를 적어주세요");
				cno = scn.nextLine();

				if (app.remove(cno)) {
					System.out.println("삭제완");
				} else {
					System.out.println("등록되어있지 않은 사원입니다.");
				}
				break;
			case 5: // 조회
				System.out.println("찾으실 입사일자를 적어주세요>>");
				cday = scn.nextLine();
				Employee c1 = app.get(cday);
				if(c1 != null) {
					c1.showInfo();
				} else {
					System.out.println("없는 사원입니다.");
				}
				break;
			case 6: // 종료
				run = false;
				System.out.println("종료합니다.");
			}
		}
	}
}