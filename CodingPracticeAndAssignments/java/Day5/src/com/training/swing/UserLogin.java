package com.training.swing;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")


class Form extends JFrame implements ActionListener {

	private Container c;
	private JLabel title;
	private JLabel username;
	private JTextField tusername;
	private JLabel password;
	private JTextField tpassword;
	private JButton login;

	public Form() {

		setTitle("Login Form");
		setBounds(300, 90, 600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Login");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(250, 30);
		c.add(title);

		username = new JLabel("Username");
		username.setFont(new Font("Arial", Font.PLAIN, 20));
		username.setSize(150, 20);
		username.setLocation(100, 100);
		c.add(username);

		tusername = new JTextField();
		tusername.setFont(new Font("Arial", Font.PLAIN, 15));
		tusername.setSize(190, 30);
		tusername.setLocation(250, 100);
		c.add(tusername);

		password = new JLabel("Password");
		password.setFont(new Font("Arial", Font.PLAIN, 20));
		password.setSize(150, 20);
		password.setLocation(100, 150);
		c.add(password);

		tpassword = new JTextField();
		tpassword.setFont(new Font("Arial", Font.PLAIN, 15));
		tpassword.setSize(190, 30);
		tpassword.setLocation(250, 150);
		c.add(tpassword);

		login = new JButton("Login");
		login.setFont(new Font("Arial", Font.PLAIN, 15));
		login.setSize(350, 30);
		login.setLocation(100, 200);
		login.addActionListener(this);
		c.add(login);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == login) {
			System.out.println(username.getText()+"  "+password.getText());
	}

	}
}

public class UserLogin {

	public static void main(String[] args) {
		Form f = new Form();
	}

}
