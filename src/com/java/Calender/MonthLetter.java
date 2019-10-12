package com.java.Calender;

public class MonthLetter //자료구조
{
	private static final int[] MAX_DAYS = {0,31,30,29,31,28,30,31};
	
	//해당 달에 맞게 달력보여쥐
	public int MonthSet(int times)
	{
		int result = MAX_DAYS[times];
		
		return result;
	}
	
	//달력보여주기
	public void prn(int times)
	{
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("---------------------");
		for(int i=1;i<times;i++)
		{
			System.out.print(i + "\t");
			if(i % 7 ==0) System.out.println("\n");
		}
	}
	
	
	
	
	
}
