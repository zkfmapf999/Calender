package com.java.Calender;

public class MonthLetter // �ڷᱸ��
{
	private static final int[] MAX_DAYS = { 0, 31, 30, 29, 31, 28, 30, 31 };

	// �ش� �޿� �°� �޷º�����
	public int MonthSet(int times) {
		int result = MAX_DAYS[times];

		return result;
	}

	// �޷º����ֱ�
	public void prn(int year, int mon, int weekend, int month) {
		int count = 0;

		System.out.printf("<< %4d�⵵ %2d�� >>\n", year, mon);
		System.out.println("su\tmo\ttu\twe\tth\tfr\tsa");
		System.out.println("---------------------");

		// ���� ����Ѵ�.
		for (int i = 0; i < weekend; i++) // su 0�� mo 1�� tu 2��
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
