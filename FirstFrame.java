package javaswing;
import javax.swing.*;
import java.awt.*;
public class FirstFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultLookAndFeelDecorated(true);;
//		frame.setSize(500,400);
//		frame.setLocation(100,100);
		frame.setBounds(100,100,500,400);	
		frame.setTitle("My First Frame ");
		ImageIcon icon = new ImageIcon("E:\\BSc CSIT MU\\loc.png");
		frame.setIconImage(icon.getImage());
		//frame.setResizable(true);
		Container c = frame.getContentPane();
		//Color color = new Color(140,100,200);
		c.setBackground(new Color(200,150,200));
		frame.setLayout(new FlowLayout());
		
		JLabel lbl = new JLabel("Welcome to Java !!",JLabel.LEFT);
		c.add(lbl);
		JLabel lbl2 = new JLabel("Programming !!");
		c.add(lbl2);
        frame.pack();
	}

}
