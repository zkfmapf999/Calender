package com.java.Calender;

import java.util.Scanner;

public class Calender_4 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String PROMPT = ">";
		
		int month = 1; //달 입력
		int[] days = {31,30,29,31,28,31,29,30,31,30};
		
		
		while(true)
		{
			System.out.println("월을 입력하세요 : ");
			
			System.out.print(PROMPT);
			month= sc.nextInt();
			
			if(month == -1) {
				break;
			}
			
			System.out.println(month + "월은 " + days[month] + "까지 있습니다.");
		}
		
		if(month == -1) System.out.println("have a nice day");
		
		sc.close();
	}
}
