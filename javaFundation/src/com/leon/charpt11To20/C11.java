package com.leon.charpt11To20;

import java.awt.Color;
import java.awt.Graphics;
import java.sql.Timestamp;
import java.util.Date;
import java.applet.Applet;

public class C11 extends Applet
{
	public void paint(Graphics g)
	{
		while (true)
		{
			g.setColor(Color.BLACK);
			g.drawRect(0, 0, getWidth(), getHeight());
			Timestamp timestamp = new Timestamp(new Date().getTime());
			//		System.out.println(timestamp.toString());
			g.setColor(Color.RED);
			g.drawString(timestamp.toString().substring(0, 19), 100, 100);

			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				g.drawString("error", 100, 100);
				repaint();
			}

		}
	}
}
