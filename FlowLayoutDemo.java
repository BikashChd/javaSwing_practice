package javaswing;
import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
	JFrame f;  
	FlowLayoutDemo()  {    
	    f = new JFrame();  
	    f.setSize(600, 600);    
		f.setVisible(true);  
		f.setTitle("Flow Layout Example");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
		Container c = f.getContentPane();	 
	    c.setLayout(new FlowLayout());    
		c.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		   
	    JButton b1 = new JButton("button1");    
	    JButton b2 = new JButton("button2");    
	    JButton b3 = new JButton("button3");    
	    JButton b4 = new JButton("button4");    
	    JButton b5 = new JButton("button5");  
	    JButton b6 = new JButton("button6");    
	    JButton b7 = new JButton("button7");    
	    JButton b8 = new JButton("button8");    
	    JButton b9 = new JButton("button9");    
	    JButton b10 = new JButton("button10");

           
	   c.add(b1);
	   c.add(b2);
	   c.add(b3);
	   c.add(b4);      
	   c.add(b5);
	   c.add(b6); 
	   c.add(b7); 
	   c.add(b8);    
	   c.add(b9);
	   c.add(b10);      
  
	}    
	  
	// main method  
	public static void main(String argvs[]) {    
	    new FlowLayoutDemo();    
	}    
	} 
