package com.leon;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DecomposeTest
{

	@Test
	public void test1()
	{
		Decompose d = new Decompose();
		long n = 11;
		assertEquals("1 2 4 10", d.decompose(n));
	}
}

class Decompose
{

	public String decompose(long n)
	{
		List<Long> temp = new ArrayList<Long>();
		for (long i = 0; i <= n; i++)
		{
			temp.add((long) Math.pow(i, 2));
		}

		return "";
	}
}