package com.leon.proxyPattern.daologger;

public class UserDao implements AbstractUserDao
{

	@Override
	public boolean findUserById(String userId)
	{
		if (userId.equalsIgnoreCase("leon"))
		{
			System.out.println("checking id is:" + userId);
			return true;
		}
		else
		{
			System.out.println("checking id: " + userId + " error");
			return false;
		}
	}


}
