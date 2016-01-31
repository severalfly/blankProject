package com.leon.charpt1To10;

public class C2
{
	public static void main(String args[])
	{
		int year = 1005;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			System.out.println(year + " is »Ú");
		}
		else
		{
			System.out.println("not ");
		}
	}
}
