package javaswing;
import java.awt.*;    
import javax.swing.*;    

public class GridLayoutDemo {
	  
	JFrame f;    
	GridLayoutDemo(){    
	    f=new JFrame();  
	    f.setSize(500,500);    
	    f.setTitle("Grid Layout Demo");
	    f.setVisible(true);    
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container c = f.getContentPane();
	    GridLayout g = new GridLayout(3,3,10,15);
	    c.setLayout(g);  
	    JButton b1=new JButton("1");    
	    JButton b2=new JButton("2");    
	    JButton b3=new JButton("3");    
	    JButton b4=new JButton("4");    
	    JButton b5=new JButton("5");    
	    JButton b6=new JButton("6");    
	    JButton b7=new JButton("7");    
	    JButton b8=new JButton("8");    
	    JButton b9=new JButton("9");    
	     // adding buttons to the frame       
	    c.add(b1); 
	    c.add(b2); 
	    c.add(b3);  
	    c.add(b4);
	    c.add(b5); 
	    c.add(b6);  
	    c.add(b7);
	    c.add(b8); 
	    c.add(b9);  
	   // setting grid layout of 3 rows and 3 columns    
	      
	    
	}    
	public static void main(String[] args) {    
	    new GridLayoutDemo();    
	}    
}
