package com.java.Calender;

import java.util.Scanner;

public class Calender_5 
{
	public static Scanner sc = new Scanner(System.in);
	
	//�޷� ���
	public static void CalenderPrn(int Month,int day)
	{
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for(int i=1; i< day; i++)
		{
			System.out.print(i + "\t");
			if(i % 7 ==0) System.out.println("\n");
		}
		
	}
	
	public static void main(String[] args)
	{
		int Month;
		String PROMPT = ">";
		int[] day = {0,31,30,31,30,29,30,31,28};
		
		while(true)
		{
			System.out.println("���� �Է��ϼ���");
			System.out.print(PROMPT);
			Month = sc.nextInt();
			
			if(Month == -1) {
				System.out.println("bye");
				break;
			}
			
			int dDay = day[Month+1];
			
			CalenderPrn(Month,dDay);
			System.out.println("\n");
		}
		
		sc.close();
	}

}
