package com.leon.codewars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Consider a sequence u where u is defined as follows:

    The number u(0) = 1 is the first one in u.
    For each x in u, then y = 2 * x + 1 and z = 3 * x + 1 must be in u too.
    There are no other numbers in u.

Ex: u = [1, 3, 4, 7, 9, 10, 13, 15, 19, 21, 22, 27, ...]

1 gives 3 and 4, then 3 gives 7 and 10, 4 gives 9 and 13, then 7 gives 15 and 22 
and so on...

Task:
Given parameter n the function dbl_linear (or dblLinear...) returns the element u(n) of 
the ordered (with <) sequence u.

Example:

dbl_linear(10) should return 22
 * @author leon
 *
 */
public class DoubleLinearTest
{
	public static void main(String[] args)
	{
		long time = System.currentTimeMillis();
		System.out.println(DoubleLinear.dblLinear(20));
		System.out.println(System.currentTimeMillis() - time);
	}

	//	private static void testing(int actual, int expected)
	//	{
	//		assertEquals(expected, actual);
	//	}
	//
	//	@Test
	//	public void testAAAA()
	//	{
	//		System.out.println("Fixed Tests dblLinear");
	//		testing(DoubleLinear.dblLinear(10), 22);
	//		testing(DoubleLinear.dblLinear(20), 57);
	//		testing(DoubleLinear.dblLinear(30), 91);
	//		testing(DoubleLinear.dblLinear(50), 175);
	//
	//	}
	//
	//	@Test
	//	public void testAll()
	//	{
	//		System.out.println("test");
	//	}

}

class DoubleLinear
{

	public static int dblLinear(int n)
	{
		List<Integer> list = new ArrayList<Integer>(3 * n);
		list.add(1);
		for (int i = 1; i < n; i++)
		{
			int pre = list.get(i - 1);
			int y = 2 * pre + 1;
			int z = 3 * pre + 1;
			if (!list.contains(y))
			{
				list.add(y);
			}
			if (!list.contains(z))
			{
				list.add(z);
			}
			list.sort(new Comparator<Integer>()
			{

				@Override
				public int compare(Integer o1, Integer o2)
				{
					if (o1 > o2)
					{
						return 1;
					}
					else if (o2 > o1)
					{
						return -1;
					}
					return 0;
				}

			});
		}

		return list.get(n);
	}

}