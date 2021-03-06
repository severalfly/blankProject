package com.leon.charpt1To10.charpt4;

public class Circle
{
	private float radius;

	public Circle()
	{
	}

	public Circle(float radius)
	{
		super();
		this.radius = radius;
	}
	
	public double getArea()
	{
		return this.radius * this.radius * 3.14;
	}
	
	public double getPerimeter()
	{
		return this.radius * 2 * 3.14;
	}
	
	public void show()
	{
		System.out.println("radis: " + this.radius);
		System.out.println("perimeter: " + getPerimeter());
		System.out.println("area: " + getArea());
	}

	public float getRadius()
	{
		return radius;
	}

	public void setRadius(float radius)
	{
		this.radius = radius;
	}

}
