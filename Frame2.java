package javaswing;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Frame2 {
	Frame2()
	{
		JFrame f = new JFrame();
		f.setTitle("Frame Demo");
		f.setSize(500,500);
		f.setLocation(100,50);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon = new ImageIcon("C:\\Users\\Resham\\Desktop\\spiral.png");
		f.setIconImage(icon.getImage());
		JLabel l = new JLabel("Welcome !");
		JButton b = new JButton("OK");
		ImageIcon icon2 = new ImageIcon("C:\\Users\\Resham\\Desktop\\camera.png");
		b.setFocusable(false);
		b.setIcon(icon2);
		b.setIconTextGap(10);
		b.setToolTipText("okay button");
		f.add(l);
		f.add(b);
	    f.setResizable(false);
		
		
	}
	public static void main(String [] args)
	{
		new Frame2();
	}

}
