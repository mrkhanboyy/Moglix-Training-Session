package com.training.swing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderDemo extends JFrame implements ChangeListener
{
	Canvas cvas ;
	JSlider js ;
	public JSliderDemo( )   		  
	{
		Container c = getContentPane(  );
		cvas = new Canvas(  );
		js = new JSlider(SwingConstants.HORIZONTAL, 0, 255, 15);
// 15 gives the default position of the scroll box

		c.add(cvas, "Center");
		c.add( js, "South");

		js.setMajorTickSpacing(20);  //  gives tick marks on the slider with a gap of 10 pixels
		js.setMinorTickSpacing(5);
		js.setPaintTicks(true); // this makes tick marks visible on the slider
		js.setPaintLabels(true);
		js.addChangeListener(this);

		
 		addWindowListener( new WindowAdapter( )   
		{
                    		public void windowClosing( WindowEvent e )  
				{
	                    		System.exit( 0 ) ;
                        	} } ) ;
	
		setTitle("Learning JTextArea");
		setSize(400,300);
		setVisible(true);
	}
	public void stateChanged(ChangeEvent e)
	{
		int value = js.getValue( ) ;
// this is taken as green component
	Color clr = new Color(200, value, 100 );
		cvas.setBackground(clr);
		cvas.repaint( );
	}
	public static void main(String args[ ])
	{
		new JSliderDemo( );
	}
}
	