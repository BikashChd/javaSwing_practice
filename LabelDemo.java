package javaswing;
import javax.swing.*;
import java.awt.*;

public class LabelDemo extends JFrame{
	
	public static void main(String [] args) {
		
		LabelDemo frame = new LabelDemo();
		frame.setTitle("Label Demo");
		frame.setVisible(true);
//		frame.setSize(300,300);
//		frame.setLocation(100,50);
	    frame.setBounds(100,200,400,500);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setResizable(true);
	    ImageIcon icon = new ImageIcon("C:\\Users\\Resham\\Desktop\\camera.png");
	    frame.setIconImage(icon.getImage());
	    Container c = frame.getContentPane();
	    c.setLayout(null);
	    
	    Font f = new Font("Arial", Font.BOLD, 20);
	    JLabel label1 = new JLabel();
	    label1.setBounds(100,50,150,40);
	    label1.setText("Username:");
	    label1.setFont(f);
	    label1.setForeground(Color.BLUE);
	    label1.setBackground(Color.red);
	    
	    c.add(label1);
	    
	 	}

}
