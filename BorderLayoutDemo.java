package javaswing;
import java.awt.*;    
import javax.swing.*;    

public class BorderLayoutDemo {
	  
	JFrame f;    
	BorderLayoutDemo() {    
	    f = new JFrame();   
	    f.setSize(300, 300); 
	    f.setTitle("Border Layout Demo");   
	    f.setVisible(true);   
	    Container c = f.getContentPane();
	    // creating buttons  
	    JButton b1 = new JButton("Button1");; // the button will be labeled as NORTH   
	    JButton b2 = new JButton("Button2");; // the button will be labeled as SOUTH  
	    JButton b3 = new JButton("Button3");; // the button will be labeled as EAST  
	    JButton b4 = new JButton("Button4");; // the button will be labeled as WEST  
	    JButton b5 = new JButton("Button5");; // the button will be labeled as CENTER
	    
	    c.add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction    
	    c.add(b2, BorderLayout.SOUTH);  // b2 will be placed in the South Direction    
	    c.add(b3, BorderLayout.EAST);  // b2 will be placed in the East Direction    
	    c.add(b4, BorderLayout.WEST);  // b2 will be placed in the West Direction    
	    c.add(b5, BorderLayout.CENTER);  // b2 will be placed in the Center    
	       
	}    
	public static void main(String[] args) {    
	    new BorderLayoutDemo();    
	}    

}
