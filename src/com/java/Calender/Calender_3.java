package com.java.Calender;

import java.util.Scanner;

public class Calender_3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ݺ� Ƚ���� �Է��ϼ��� :");
		//�ݺ���
		int iterator = sc.nextInt();
		
		System.out.println("���� �Է��ϼ��� : ");
		
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
			System.out.println(month[i] + "����" + days[i] + "���� �ֽ��ϴ�." );
		}
		
		sc.close();
		
		
	}

}
