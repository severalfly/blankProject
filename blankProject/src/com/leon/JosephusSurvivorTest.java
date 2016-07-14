package com.leon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JosephusSurvivorTest
{

	@Test
	public void test1()
	{
		josephusTest(7, 3, 4);
	}

	@Test
	public void test2()
	{
		josephusTest(11, 19, 10);
	}

	@Test
	public void test3()
	{
		josephusTest(40, 3, 28);
	}

	@Test
	public void test4()
	{
		josephusTest(14, 2, 13);
	}

	@Test
	public void test5()
	{
		josephusTest(100, 1, 100);
	}

	private void josephusTest(final int n, final int k, final int result)
	{
		String testDescription = String.format("Testing where n = %d and k = %d", n, k);
		assertEquals(testDescription, result, JosephusSurvivor.josephusSurvivor(n, k));
	}
}

class JosephusSurvivor
{
	public static int josephusSurvivor(final int n, final int k)
	{
		int[] temp = new int[n];
		for (int i = 0; i < n; i++)
		{
			temp[i] = 1;
		}
		int leftCnt = n;
		int i = 0;
		while (leftCnt > 1)
		{
			for (int j = 0; j < n; j++)
			{
				if (temp[j] == 0)
				{
					continue;
				}
				i = (i + 1) % k;
				if (i == 0)
				{
					temp[j] = 0;
					leftCnt--;
					if (leftCnt <= 1)
					{
						break;
					}
				}
			}
		}
		int result = -1;
		for (int j = 0; j < n; j++)
		{
			if (temp[j] == 1)
			{
				result = j;
				break;
			}
		}
		return result + 1;
	}
}