package javaswing;
import java.awt.*;
import javax.swing.*;

public class NullLayoutDemo extends JFrame {
	
	public static void main(String [] args) {
		
		NullLayoutDemo f = new NullLayoutDemo();
		f.setSize(500,500);
		f.setLocation(100,50);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = f.getContentPane();
		c.setLayout(null);
		
		JLabel name = new JLabel("Username:");
		JLabel pass = new JLabel("Password:");
		JTextField tname = new JTextField(20);
		JPasswordField pass1 = new JPasswordField(20);
		JButton b1 = new JButton("Login");
		
		name.setBounds(100,50,100,40);
		tname.setBounds(210,50,250,40);
		pass.setBounds(100,120,100,40);
		pass1.setBounds(210,120,250,40);
		b1.setBounds(200,190,100,40);
		
		
		c.add(name);
		c.add(tname);
		c.add(pass);
		c.add(pass1);
		c.add(b1);
				
	}

}
