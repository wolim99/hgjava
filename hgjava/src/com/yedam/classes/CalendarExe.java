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
			date = sdf.parse("2024-03-01"); // String -> Date
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(date.getDate());
	drawCalemdar(date); // 숙제.
	}
	
	static void drawCalemdar(Date date) {
		
	}
	
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
