package com.java.Calender;

import java.util.Scanner;

public class Calender_4 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String PROMPT = ">";
		
		int month = 1; //�� �Է�
		int[] days = {31,30,29,31,28,31,29,30,31,30};
		
		
		while(true)
		{
			System.out.println("���� �Է��ϼ��� : ");
			
			System.out.print(PROMPT);
			month= sc.nextInt();
			
			if(month == -1) {
				break;
			}
			
			System.out.println(month + "���� " + days[month] + "���� �ֽ��ϴ�.");
		}
		
		if(month == -1) System.out.println("have a nice day");
		
		sc.close();
	}
}
