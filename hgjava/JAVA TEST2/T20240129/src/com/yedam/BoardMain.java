package com.yedam;

import java.util.Scanner;
import java.util.List;

public class BoardMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BoardApp app = new BoardApp();
		boolean run = true;
		app.init();

		int choice;
		while (run) {
			System.out.println("1.추가 2.수정 3.조회 4.삭제 5.목록 6.종료");
			System.out.print("선택: ");
			choice = scn.nextInt();
			scn.nextLine();

			switch (choice) {
			case 1:
				System.out.print("번호: ");
				int no = scn.nextInt();
				scn.nextLine(); 
				System.out.print("제목: ");
				String title = scn.nextLine();
				System.out.print("내용: ");
				String section = scn.nextLine();
				System.out.print("작성자: ");
				String name = scn.nextLine();
				app.register(no, title, section, name);
				System.out.println("게시글이 추가되었습니다.");
				break;
			case 2:
				System.out.print("수정할 게시글 번호: ");
				int modNo = scn.nextInt();
				scn.nextLine();
				System.out.print("새 내용: ");
				String newSection = scn.nextLine();
				app.modify(modNo, newSection);
				System.out.println("게시글이 수정되었습니다.");
				break;
			case 3:
				System.out.print("조회할 게시글 번호: ");
				int searchNo = scn.nextInt();
				Board board = app.getBoard(searchNo);
				if (board != null) {
					System.out.println("번호: " + board.getNo());
					System.out.println("제목: " + board.getTitle());
					System.out.println("내용: " + board.getSection());
					System.out.println("작성자: " + board.getName());
					System.out.println("작성일: " + board.getDay());
				} else {
					System.out.println("해당 번호의 게시글이 존재하지 않습니다.");
				}
				break;
			case 4:
				System.out.print("삭제할 게시글 번호: ");
				int delNo = scn.nextInt();
				app.remove(delNo);
				System.out.println("게시글이 삭제되었습니다.");
				break;
			case 5:
				List<Board> boards = app.getList();
				for (Board b : boards) {
					System.out.println("번호: " + b.getNo() + ", 제목: " + b.getTitle() + ", 내용: " + b.getSection()
							+ ", 작성자: " + b.getName() + ", 작성일: " + b.getDay());
				}
				break;
			case 6:
				System.out.println("프로그램을 종료 합니다.");
				app.save();
				run = false;
			}
		}
	}
}
