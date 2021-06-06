package com.training.applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;


public class MyApplet extends Applet 
{
	int chsX=100, chsY=100;
	public MyApplet() 
	{
		addMouseMotionListener(new MouseMotionAdapter() 
		{
			public void mouseMoved(MouseEvent me) 
			{
				int x = me.getX();
				int y = me.getY();
				chsX = x-10;
				chsY = y-10;
				repaint();
			}
		});
	}
	public void paint(Graphics g) 
	{
		g.drawLine(0, 0, 100, 100);
		g.drawLine(0, 100, 100, 0);
		g.setColor(Color.blue);
		g.drawLine(40, 25, 250, 180);
		g.drawLine(75, 90, 400, 400);
		g.setColor(Color.green);
		g.drawRect(10, 10, 60, 50);
		g.fillRect(100, 10, 60, 50);
		g.setColor(Color.red);
		g.drawRoundRect(190, 10, 60, 50, 15, 15);
		g.fillRoundRect(70, 90, 140, 100, 30, 40);
		g.setColor(Color.cyan);
		g.drawLine(20, 150, 400, 40);
		g.drawLine(5, 290, 80, 19);
		// xor cross hairs
		g.setXORMode(Color.black);
		g.drawLine(chsX-10, chsY, chsX+10, chsY);
		g.drawLine(chsX, chsY-10, chsX, chsY+10);
		g.setPaintMode();
	}
}



//-----------------------------------------------------------------

//@SuppressWarnings("serial")
//public class MyApplet extends Applet {
//
//int height,width;
//	
//	public void init() {
//		System.out.println("Init is called");
//		height=getSize().height;
//		width=getSize().width;
//		setName("Myapplet");
//	}
//	
//	public void start() {
//		System.out.println("Start is called");
//	}
//	public void stop() {
//		System.out.println("Stop is called");
//	}
//	
//	public void distroy() {
//		System.out.println("Distroy is called");
//	}
//	
//	public void paint(Graphics g) {
//		System.out.println("paint is called");
////		g.drawRoundRect(10, 20, 120, 120, 2, 3);
////		g.drawString("simple applet", 20,20);
////		g.drawString("My String", 100, 100);
////		g.drawRect(20, 20, 100, 100);
//		g.drawOval(300, 300, 130, 130);
//		g.drawOval(300, 300, 120, 120);
//		g.drawOval(300, 300, 110, 110);
//		g.drawOval(300, 300, 100, 100);
//		g.drawOval(300, 300, 90, 90);
//		g.drawOval(300, 300, 80, 80);
//		g.drawOval(300, 300, 70, 70);
//		g.drawOval(300, 300, 60, 60);
//		g.drawOval(300, 300, 50, 50);
//	}
//}


//--------------------------------------------APPLET FORM------------------------------------

//public class MyApplet extends Frame implements ActionListener
//{   
//	// no window closing, you can write extra
//
//	// creating reference variables
//	Label lab1;
//	TextField tf1, tf2, tf3;
//	Button btn;
//	// constructor
//	public MyApplet( )
//	{
//		setLayout(new GridLayout(4,2,10,15));
//
//		// 3 rows, 2 columns, 10 Hgap, 15 Vgap
//
//		// filling the gaps with yellow color
//		setBackground(Color.yellow);
//
//		// Label is a component like a Button
//		lab1= new Label("Enter User Name");
//
//		// creating text fields
//		tf1 = new TextField(15);
//		tf2 = new TextField(15);
//		tf3 = new TextField("I Display",15);  
//
//		btn = new Button("VALIDATE");
//		// registering text field with AL
//		btn.addActionListener(this);
//
//		// beautification(optional)
//		tf2.setEchoChar('*');          // displayed as *
//		tf3.setEditable(false);         // user cannot enter anything
//		tf3.setBackground(Color.cyan);
//		tf3.setForeground(Color.blue);
//		tf3.setFont(new Font("Monospaced", Font.BOLD, 25));
//
//		// adding components, order is important
//		add(lab1);
//		add(tf1);
//		// adding anonymous label
//		add(new Label("Enter Password"));
//		add(tf2);
//
//		add(new Label("CLICK HERE"));
//		add(btn);
//
//
//		add(new Label("Result"));
//		add(tf3);
//
//		setTitle("Validating User name and Password ");
//		setSize(300,200);
//		setVisible(true);
//	}
//
//	// override the only abstract method of AL
//	public void actionPerformed(ActionEvent e)
//	{
//		// to read what the user entered
//		String s1 = tf1.getText();  
//		String s2 = tf2.getText();
//		// validation
//		if(s1.equalsIgnoreCase("snrao")&&(s2.equalsIgnoreCase("java")))
//		{
//			// displaying in text field
//			tf3.setText("VALID");  
//			tf3.setBackground(Color.green);
//		}
//		else
//		{
//			tf3.setText("INVALID");
//			tf3.setBackground(Color.red);
//		}
//	}  // close of actionPerformed( )
//
//	public static void main(String[] args)
//	{
//		new MyApplet();
//	}
//}
