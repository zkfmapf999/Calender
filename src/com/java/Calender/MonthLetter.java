package com.java.Calender;

public class MonthLetter // 자료구조
{
	private static final int[] MAX_DAYS = { 0, 31, 30, 29, 31, 28, 30, 31 };

	// 해당 달에 맞게 달력보여쥐
	public int MonthSet(int times) {
		int result = MAX_DAYS[times];

		return result;
	}

	// 달력보여주기
	public void prn(int year, int mon, int weekend, int month) {
		int count = 0;

		System.out.printf("<< %4d년도 %2d월 >>\n", year, mon);
		System.out.println("su\tmo\ttu\twe\tth\tfr\tsa");
		System.out.println("---------------------");

		// 공백 출력한다.
		for (int i = 0; i < weekend; i++) // su 0개 mo 1개 tu 2개
		{
			System.out.print("\t");
			count++;
		}
		for (int i = 1; i <= month; i++) {
			System.out.print(i + "\t");
			count++;

			if (count == 7) {
				System.out.println("\n");
				count = 0;
			}
		}
	}
}
