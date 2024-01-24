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

	}

	private static void checkGender(String ssn) {

	}

}