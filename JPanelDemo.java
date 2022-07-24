package javaswing;

import javax.swing.*;
import java.awt.*;

class JPanelDemo
{
	
	public static void main(String [] args)
	{
		JFrame fr = new JFrame("JPanel Demo");
		fr.setBounds(0,0,350,600);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = fr.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.BLUE);
		
		JPanel panel = new JPanel();
		panel.setBounds(0,0,350,200);
		panel.setBackground(Color.RED);
		panel.setLayout(null);
		c.add(panel);
                
 		JPanel panel1 = new JPanel();
		panel1.setBounds(0,200,350,200);
        panel1.setBackground(Color.YELLOW);
		panel1.setLayout(null);
		c.add(panel1);
		
		String [] friends = {"Ramesh", "Keshava", "Kumar", "Ashok", "Prakash"};
		JList list = new JList(friends);
		
		JScrollPane jsp = new JScrollPane(list);
		jsp.setBounds(50,50,200,60);
		panel1.add(jsp);
		
	
	}
}