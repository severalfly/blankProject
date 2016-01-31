package com.leon.charpt1To10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C5
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("please input the first string:");
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			String s1 = strin.readLine();
			System.out.println("please input the second string:");
			String s2 = strin.readLine();
			String s = s1 + s2;

			int i = Integer.parseInt(s1) + Integer.parseInt(s2);
			float f = Float.parseFloat(s1) + Float.parseFloat(s2);
			System.out.println(s);
			System.out.println(i);
			System.out.println(f);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
