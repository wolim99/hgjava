package com.yedam.api;


import java.text.ParseException;

public class StringTest {
	public static void main(String[] args) throws ParseException {
		// 1번문제 데이터 성결구분
		String[] jumins = { "970101-1234567" // 남자
				, "9701012234567" // 여자
				, "971201 1594235" // 남자
				, "981105 1458423" // 여자
				, "030505 2234847" // 1903년 오류
		};

		for (String ssn : jumins) {
			checkGender(ssn);
		}

		// 2번 문제 데이터 길동이가 몇번 나오는지 출력 - 반복문 + count 사용하면됨
		String[] names = { "김길동", "홍길동", "이상민", "김민수", "길동이" };

		for (String fri : names) {
			checkName(fri);
		}
	}

	private static void checkName(String fri) {
	    int count = 0;

	    if (fri.contains("길동")) {
	        count++;
	    }

	    System.out.println("이름에 '길동'이 포함된 횟수: " + count);
	}


	private static void checkGender(String ssn) {
	    if (ssn.length() == 14) {
	        char genderCode = ssn.charAt(7); // 성별 구분 코드 추출

	        if (genderCode == '1' || genderCode == '3') {
	            System.out.println(ssn + "은(는) 남자입니다.");
	        } else if (genderCode == '2' || genderCode == '4') {
	            System.out.println(ssn + "은(는) 여자입니다.");
	        } else {
	            System.out.println(ssn + "은(는) 잘못된 성별 코드입니다.");
	        }
	    } else {
	        System.out.println(ssn + "은(는) 잘못된 주민등록번호 형식입니다.");
	    }
	}


}