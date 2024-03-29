package com.yedam.classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExe {
	public static void main(String[] args) {
		final int num = 10;
		// num = 20;
		Calendar cal = Calendar.getInstance();
		cal.set(2024, 1, 1);
//		System.out.println("year: " + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("last Date:" + cal.getActualMaximum(Calendar.DATE));

//		drawCalendar(2024, 2);
		Date date = new Date(); // 1900년
		// 2024-10-5
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			date = sdf.parse("2024-01-01"); // String -> Date
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(date.getDate());
		drawCalendar(date); // 숙제.
	}

	// - 과제 -
	static void drawCalendar(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date); // Date 객체를 이용하여 Calendar 객체 설정

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		cal.set(year, month, 1); // 해당 월의 첫 번째 날로 설정

		int pos = cal.get(Calendar.DAY_OF_WEEK) - 1;
		int lastDate = cal.getActualMaximum(Calendar.DATE);

		// 요일 출력
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (String day : days) {
			System.out.printf("%4s", day);
		}
		System.out.println();

		// 해당 월의 첫 번째 날까지 공백으로 채움
		for (int i = 0; i < pos; i++) {
			System.out.printf("%4s", "");
		}

		// 날짜 출력
		for (int d = 1; d <= lastDate; d++) {
			System.out.printf("%4d", d);
			if ((d + pos) % 7 == 0) { // 줄바꿈 조건
				System.out.println();
			}
		}
		System.out.println();
	}
	// 과제 해석
	// static void drawCalendar(Date date) {

	// }

	// 수업
	static void drawCalendar(int year, int month) {
		// (2024, 1)
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);

		int pos = cal.get(Calendar.DAY_OF_WEEK) - 1;
		int lastDate = cal.getActualMaximum(Calendar.DATE);

		// 요일 출력
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println(""); // 1일 요일지정
		for (int i = 0; i < pos; i++) {
			System.out.printf("%4s", "", "");
		}
		for (int d = 1; d <= lastDate; d++) {
			System.out.printf("%4d", d);
			if (d % 7 == 7 - pos) {
				System.out.printf("\n");
			}
		}
	}
}
