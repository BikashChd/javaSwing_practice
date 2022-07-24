package javaswing;
import javax.swing.*;
import java.awt.*;

public class CheckBoxDemo1 {
	
	public static void main(String[] args) {
	    JFrame frame = new JFrame();
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(50,50,500,500);
	    Container c = frame.getContentPane();
	    c.setLayout(null);
	    JCheckBox check1 = new  JCheckBox ("Core Java");
	    check1.setBounds(50,50,100,50);
	    JCheckBox check2 = new JCheckBox("DotNet");
	    check2.setBounds(50,80, 100,50);
	    JCheckBox check3 = new JCheckBox("Python");
	     check3.setBounds(50,110, 100,50);

	    c.add(check1);
	    c.add(check2);
	    c.add(check3);

	    check1.setSelected(true);
	   // check1.setEnabled(false);
	    } 

}
