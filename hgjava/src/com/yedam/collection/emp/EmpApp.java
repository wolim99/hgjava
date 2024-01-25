package com.yedam.collection.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// 좀더 알아봐야함
public class EmpApp {
	public static void main(String[] args) {
		List<Employee> storage = new ArrayList<>();

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int menu = Integer.parseInt(scn.nextLine());

		while (run) {
			System.out.println("1.등록 2.조회(입사일자) 9.종료");
			// "23-03-01"
			SimpleDateFormat adf = new SimpleDateFormat("yy-MM-dd");

			switch (menu) {
			case 1: // 등록
				System.out.printf("사원의 번호, 이름, 입사일, 급여를 적어주세요\n");
				String allAry = scn.nextLine();
				String allArys[] = allAry.split(" ");
				boolean isOk = true;
				try {
					storage.add(new Employee(Integer.parseInt(allAry), allArys[1], // 이름
							adf.parse(allArys[2]),// 입사일
							Integer.parseInt(allArys[3]))); // 급여
				} catch (ParseException e) {
					System.out.println("날짜 포맷이 부정확");
					isOk = false;
				}
				System.out.println("추가되었습니다");
				break;
			case 2: // 조회
				Date searchCondition = null;
				while (true) {
					System.out.println("조회일 입력");
					try {
						searchCondition = adf.parse(scn.nextLine());
						break;
					} catch (ParseException e) {
						System.out.println("날짜 포맷이 부정확");
						
					}
				}
				for (int i = 0; i < storage.size(); i++) {
					if (storage.get(i).getHireDate().after(searchCondition)
							|| storage.get(i).getHireDate().equals(searchCondition)) {
						System.out.println(storage.get(i).toString());
					}
					break;
				}
			case 9:
				run = false;
				System.out.println("종료 합니다");
			}
			
		}
		System.out.println("end of prog");
	}

	void method() {
		// "101 홍길동 23-05-08 100"
		String val = "101 홍길동 23-05-08 100";
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

		String[] valAry = val.split(" ");
		for (String value : valAry) {
			System.out.println(value);
		}
		try {
			new Employee(Integer.parseInt(valAry[0]), // 사원번호
					valAry[1], // 이름
					sdf.parse(valAry[2]), // 입사일
					Integer.parseInt(valAry[3]) // 급여
			);
		} catch (Exception e) {

		}
	}
}
