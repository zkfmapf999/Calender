package com.java.Calender;

public class MonthLetter //�ڷᱸ��
{
	private static final int[] MAX_DAYS = {0,31,30,29,31,28,30,31};
	
	//�ش� �޿� �°� �޷º�����
	public int MonthSet(int times)
	{
		int result = MAX_DAYS[times];
		
		return result;
	}
	
	//�޷º����ֱ�
	public void prn(int times)
	{
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("---------------------");
		for(int i=1;i<times;i++)
		{
			System.out.print(i + "\t");
			if(i % 7 ==0) System.out.println("\n");
		}
	}
	
	
	
	
	
}
