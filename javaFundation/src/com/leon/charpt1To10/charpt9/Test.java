package com.leon.charpt1To10.charpt9;

public class Test
{
	public static void main(String[] args)
	{
		Thread t1 = new ThreadDemo("qwer");
		Thread t2 = new ThreadDemo("asdf");
		Thread t3 = new ThreadDemo("zxcv");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
