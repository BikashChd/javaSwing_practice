package javaswing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ActionEventDemo2 extends JFrame implements ActionListener {
	
	JButton btn1 = new JButton("Action 1");
	JButton btn2 = new JButton("Action 2");
	JButton btn3 = new JButton("Action 3");
	Container c;
	ActionEventDemo2() {
	c = this.getContentPane();
	c.setLayout(null);
	btn1.setBounds(50,100,100,50);
	btn2.setBounds(50,200,100,50);
	btn3.setBounds(50,300,100,50);
	btn1.addActionListener(this);
	btn2.addActionListener(this);
	btn3.addActionListener(this);
		
	c.add(btn1);
	c.add(btn2);
	c.add(btn3);
	}
	
	public void actionPerformed(ActionEvent e)	{
	 if(e.getSource()== btn1)
	            c.setBackground(Color.RED);
	 if(e.getSource()== btn2)
	            c.setBackground(Color.GREEN);
	 if(e.getSource()==btn3)
	            c.setBackground(Color.YELLOW);
	}
	
	 public static void main(String[] args)  {
	 ActionEventDemo2 fr = new ActionEventDemo2();
	 fr.setVisible(true);
	 fr.setBounds(50,50,500,500);
	 fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }

}
