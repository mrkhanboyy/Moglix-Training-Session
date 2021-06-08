package com.training.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
//

//
//	public class SwingExample {
//		static int text = 1;
//		public static void main(String[] args) {
//			JFrame jF = new JFrame();
//			JButton btn = new JButton("Click");
//			btn.setBounds(130, 100, 100, 40);
//			jF.add(btn);
//			btn.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					btn.setText("clicks:" + text + "");
//					text += 1;
//				}
//			});
//			jF.setSize(400, 500);
//			jF.setLayout(null);
//			jF.setVisible(true);
//		}
//	}

//---------------------------------------------------------------------



@SuppressWarnings("serial")
public class SwingExample extends JFrame implements ItemListener
{
	JTextField tf ;
	JCheckBox namebox, boldbox, italicbox ;

	public SwingExample( )
	{
		Container c = getContentPane( ); 	
		c.setLayout(new FlowLayout( ));
		// create the text field
		tf = new JTextField("J2EE or .NET; which will be popular", 30);
		c.add(tf);
		// create JCheckBox objects
		namebox = new JCheckBox("Monospaced");
		c.add(namebox);		

		boldbox = new JCheckBox("Bold"); // Bold will be displayed 
		c.add(boldbox);		   // besides the checkbox

		italicbox = new JCheckBox("Italic");
		c.add(italicbox);		
		// register each checkbox with ItemListener
		namebox.addItemListener(this);
		boldbox.addItemListener(this);
		italicbox.addItemListener(this);

		addWindowListener( new WindowAdapter( )
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		} ) ;

		setTitle("Learning JButton");
		setSize(400,200);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		String fontname = "";  // some compilers will raise error if local variables

		int b = 0, i = 0 ;	// are not initialized

		if(namebox.isSelected( ) )
			fontname = "Monospaced";
		else
			fontname = "Serif";

		if(boldbox.isSelected( ) )
			b = Font.BOLD;
		else
			b = Font.PLAIN;

		if(italicbox.isSelected( ) )
			i = Font.ITALIC;
		else
			i = Font.PLAIN;

		Font f = new Font(fontname, b + i , 15);			
		tf.setFont( f );  // setting a font to the text in the text field
	}

	public static void main( String args[ ] )
	{
		new SwingExample( ) ;
	}
}





