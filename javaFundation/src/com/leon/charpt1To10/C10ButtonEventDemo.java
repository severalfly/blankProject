package com.leon.charpt1To10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class C10ButtonEventDemo extends JPanel implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3456118015290773396L;
	protected JButton b1;

	public C10ButtonEventDemo()
	{
		ImageIcon ButtonIcon = new ImageIcon("image/1.png");
		b1 = new JButton("退出", ButtonIcon);
		b1.setMnemonic(KeyEvent.VK_E);
		b1.setToolTipText("这是退出按钮");
		this.add(b1);
		b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.exit(0);
	}

	private static void createUI()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new  JFrame("按钮测试");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		C10ButtonEventDemo cPanel = new C10ButtonEventDemo();
		cPanel.setOpaque(true);
		frame.setContentPane(cPanel);
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				createUI();
			}
		});
	}
}
