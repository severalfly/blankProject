package com.leon.charpt1To10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C6
{
	public static void main(String[] args)
	{
		byte[] buffer = new byte[1024];
		try
		{
			FileInputStream in = new FileInputStream(new File("D:\\workspace\\javaFundation\\src\\com\\leon\\charpt1To10\\C1.java"));
			in.read(buffer,0,1024);
			String s = new String(buffer);
			System.out.println(s);
		}
		catch (FileNotFoundException  e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
