package com.java.Calender;

import java.util.Scanner;

public class Calender_2 
{
	public static void main(String[] args)
	{
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		
		System.out.println("�� ���� �Է��϶�");
		
		s1 = sc.next();
		s2 = sc.next();
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		System.out.println("s1 + s2 = " + (a+b));
	}

}
