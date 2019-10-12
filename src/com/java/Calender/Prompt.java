package com.java.Calender;

import java.util.Scanner;

public class Prompt // gui
{
	private static Scanner sc = new Scanner(System.in);
	
	public int textPrn(String weekend)
	{
		int result = 0;
		switch(weekend)
		{
		case "su": result =0;
			break;
			
		case "mo": result =1;
			break;
			
		case "tu": result =2;
			break;
			 
		case "wd": result =3;
			break;
			
		case "th": result =4;
			break;
			
		case "fr": result =5;
			break;
			
		case "sa": result =6;
			break;
			
			default: System.out.println("�߸��Է�"); break;	
		}
		
		return result;
	}

	public void prn() 
	{
		MonthLetter cal = new MonthLetter();
		
		int year = -1; // ����
		int month = -1; //��¥
		int weekend = 0; //�ָ�

		while (true) 
		{	
			System.out.println("������ �Է��ϼ��� ");
			System.out.print("YEAR> ");
			year = sc.nextInt();
			
			System.out.println("���� �Է��ϼ��� ");
			System.out.print("MONTH> ");
			month = sc.nextInt();
			
			
			System.out.println("������ �Է��ϼ��� (su, mo, tu, wd, th, fr, sa)");
			System.out.print("DAYS> ");
			String week = sc.next(); 
			weekend = textPrn(week);
			
			if(month == -1) 
			{
				System.out.println("---end---");
				break;
			}

			int days = cal.MonthSet(month);

			cal.prn(year, month, weekend, days);
			
			System.out.println("\n");
		}

	}
}
