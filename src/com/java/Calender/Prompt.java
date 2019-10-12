package com.java.Calender;

import java.util.Scanner;

public class Prompt // gui
{
	private static Scanner sc = new Scanner(System.in);
	private static String PROMPT = "cal>";

	public void prn() {
		MonthLetter cal = new MonthLetter();

		while (true) 
		{
			System.out.println("월을 입력하세요 ");
			System.out.print(PROMPT);
			int month = sc.nextInt();
			
			if(month == -1) 
			{
				System.out.println("---end---");
				break;
			}

			int days = cal.MonthSet(month);

			cal.prn(days);
			System.out.println("\n");
		}

	}
}
