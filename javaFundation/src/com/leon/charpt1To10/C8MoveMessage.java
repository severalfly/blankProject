package com.leon.charpt1To10;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class C8MoveMessage extends JApplet implements Runnable
{
	String str;
	int time;
	private Thread thread;

	public void init()
	{
		setBackground(Color.PINK);
		str = getParameter("message");
		System.out.println("message " + str);
		String timeArg = getParameter("time");
		System.out.println("timeArg is: " + timeArg);
		this.time = Integer.parseInt(timeArg);
		thread = new Thread(this);
	}

	public void start()
	{
		thread.start();
	}

	@Override
	public void run()
	{
		int x = 0;
		Graphics g = getGraphics();
		while (true)
		{
			try
			{
				Thread.sleep(time);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			g.clearRect(0, 0, getWidth(), getWidth());
			g.drawString(str, x, 30);
			x += 2;
			if (x >= getWidth())
			{
				x = 0;
			}
		}
	}

}