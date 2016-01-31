package com.leon.charpt11To20;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.sql.Timestamp;
import java.util.Date;

public class C11Watch extends Applet
{

	public void paint(Graphics g)
	{
		Timestamp timestamp = new Timestamp(new Date().getTime());
		System.out.println(timestamp.toString());
		g.setColor(Color.RED);
		g.drawString(timestamp.toString().substring(0, 19), 50, 100);

		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			g.drawString("error", 100, 100);
			repaint();
		}
		paint(g);
	}
}
