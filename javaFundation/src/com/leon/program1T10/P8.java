package com.leon.program1T10;

import java.util.Scanner;

public class P8
{
	public static void main(String[] args)
	{
		long a = 0, b = 0;
		long sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数a：");
		a = scanner.nextInt();
		System.out.println("请输入一个数b：");
		int n = scanner.nextInt();
		int i = 0;
		while(i < n)
		{
			b = b*10 +a;
			sum += b;
			
			i ++;
		}
			
		System.out.println(sum);
	}
}
