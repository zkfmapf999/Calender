package com.java.Calender;

import java.util.Scanner;

public class Calender_3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반복 횟수를 입력하세요 :");
		//반복자
		int iterator = sc.nextInt();
		
		System.out.println("월을 입력하세요 : ");
		
		int ndata;
		int[] month = new int[iterator];
		int[] days = {31,28,31,30,29,31};
		

		for(int i=0; i<iterator; i++)
		{
			ndata = sc.nextInt();
			month[i] = ndata;
		}
		
		for(int i=0; i<iterator; i++)
		{
			System.out.println(month[i] + "월은" + days[i] + "까지 있습니다." );
		}
		
		sc.close();
		
		
	}

}
