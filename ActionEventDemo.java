package javaswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionEventDemo extends JFrame implements ActionListener {
	
	ActionEventDemo()
	{
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		Container c = getContentPane();
		JLabel l = new JLabel("This is ActionEventDemo.");
		JButton b = new JButton("Ok");
		b.addActionListener(this);  // registering listener with button
		c.add(l);
		c.add(b);
				
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println(" You clicked ok button.");
	}
	
	
	public static void main(String [] args)
	{
		new ActionEventDemo();
	}

}
