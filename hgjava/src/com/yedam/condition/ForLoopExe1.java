package com.yedam.condition;

public class ForLoopExe1 {
	public static void main(String[] args) {
		//
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
			if (i > 5) {
				break;
			}
		}
		// 1 ~ 10 까지 합을 계산.

		int sum = 0;
		for (int n = 1; n <= 10; n++) {
			if (n % 2 != 0)
				sum += n;
		}
		System.out.printf("누적값은 %d \n", sum);

		// 1부터 31 까지 반복
		System.out.println("Sun\tMon\tTue\tWed\tThr\tFri\tSat");
		System.out.printf("\t","\t","\t");
		for (int d = 1; d <= 31; d++) {
			System.out.printf("%3d\t", d);
			if (d % 7 == 6) {
				System.out.println();
			}

		}
   }

}
