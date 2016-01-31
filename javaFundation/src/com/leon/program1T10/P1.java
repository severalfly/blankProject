package com.leon.program1T10;

public class P1
{
	public static void main(String[] args)
	{
		long f1 = 1;
		long f2 = 1;
		long f = 0;
		for (int i = 3; i < 100; ++i)
		{
			f = f1 + f2;
			f1 = f2;
			f2 = f;
			System.out.println("第 " + i + " 月，兔子数为 " + f);
		}
	}
}
