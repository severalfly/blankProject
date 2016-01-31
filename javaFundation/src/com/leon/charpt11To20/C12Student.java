package com.leon.charpt11To20;

import java.util.LinkedList;
import java.util.List;

public class C12Student
{
	private String no;
	private String name;
	private String agend;
	private int age;
	private int java;


	public C12Student(String no, String name, String agend, int age, int java)
	{
		super();
		this.no = no;
		this.name = name;
		this.agend = agend;
		this.age = age;
		this.java = java;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getJava()
	{
		return java;
	}

	public void setJava(int java)
	{
		this.java = java;
	}

	public String getNo()
	{
		return no;
	}

	public void setNo(String no)
	{
		this.no = no;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAgend()
	{
		return agend;
	}

	public void setAgend(String agend)
	{
		this.agend = agend;
	}


	public static void main(String[] args)
	{
		List<C12Student> list = new LinkedList<>();
		list.add(new C12Student("1", "小张", "m", 24, 87));
		list.add(new C12Student("2", "小陈", "m", 23, 89));
		list.add(new C12Student("3", "小马", "m", 25, 86));
		list.add(new C12Student("4", "小王", "m", 22, 86));
		
		float javaSum = 0;
		int min = 100;
		int max = 0;
		
		for (C12Student st : list)
		{
			System.out.println(st.getNo() + st.getName() + st.getAgend() + st.getAge() + st.getJava());
			javaSum += st.getJava();
			if (st.getJava() < min)
			{
				min = st.getJava();
			}
			if(st.getJava() > max )
			{
				max = st.getJava();
			}
		}
		
		System.out.println(javaSum/ list.size());
		System.out.println(max);
		System.out.println(min);
	}
}
