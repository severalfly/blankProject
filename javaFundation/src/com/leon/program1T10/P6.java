package com.leon.program1T10;

public class P6
{
	public static void main(String[] args)
	{
		int x = 15;
		int y = 6;
		Deff deff = new Deff();
		int c = deff.deff(x, y);
		int d = x*y/c;
		System.out.println(c);
		System.out.println(d);
	}
}

class Deff
{
	public int deff(int x, int y)
	{
		int t;
		if (x < y)
		{
			t = x;
			x = y;
			y = t;
		}

		while (y != 0)
		{
			t = x % y;
			x = y;
			y = t;
		}
		return x;
	}
}
