package com.leon.utils;

public class ObjectUtils
{
	public static boolean isNull(Object obj)
	{
		if (obj == null || "".equals(obj))
		{
			return true;
		}
		return false;
	}

	public static boolean isNotNull(Object obj)
	{
		return !isNull(obj);
	}

}
