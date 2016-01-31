package com.leon.charpt1To10.charpt4;

public class Cylinder extends Circle
{
	private double hight;

	public Cylinder()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Cylinder(float radius, double hight)
	{
		super(radius);
		this.hight = hight;
	}
	
	public double getVolume()
	{
		return getArea() * this.hight;
	}
	
	public void showVolume()
	{
		System.out.println("Volume: " + getVolume());
	}
	
	

	public double getHight()
	{
		return hight;
	}

	public void setHight(double hight)
	{
		this.hight = hight;
	}

	
}
