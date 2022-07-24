package javaswing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TextAreaDemo  implements ActionListener
{
	
	JLabel label1,label2;
	JTextArea ta;
	JButton btn;
	Container c;
	
	TextAreaDemo()
	{
		JFrame fr = new JFrame("TextArea Demonstration");
		fr.setBounds(50,50,800,800);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = fr.getContentPane();
		c.setLayout(null);
		
		ta = new JTextArea("This is my text area.");
		ta.setBounds(300,50,200,250);
				
		ta.setEditable(true);	
		ta.setFont(new Font("Serif", Font.BOLD, 16));
		ta.setLineWrap(true);
      		ta.setWrapStyleWord(true);
		
		label1 = new JLabel("Words:");
		label1.setBounds(50,50,100,40);
		
		label2 = new JLabel("Characters:");
		label2.setBounds(50,100,150,20);
		
		btn = new JButton("Count");
		btn.setBounds(100,250,100,30);
		
		btn.addActionListener(this);
		
		c.add(label1);
		c.add(label2);
		c.add(ta);
		c.add(btn);
		
		c.revalidate();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String text=ta.getText();  
		String words[]=text.split("\\s");  
		label1.setText("Words: "+words.length);  
		label2.setText("Characters: "+text.length());  
	}	
	
	public static void main(String[] args)
	{
		TextAreaDemo t = new TextAreaDemo();
        }
}
		