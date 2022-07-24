package javaswing;
import javax.swing.*;  

public class JOptionPaneDemo {
	JFrame f;  
	JOptionPaneDemo(){  
	    f=new JFrame();  
	    f.setVisible(true);
	    f.setSize(200,300);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JOptionPane.showMessageDialog(f,"Hello, Welcome to JOptionPane.");  
	}  
	public static void main(String[] args) {  
	    new JOptionPaneDemo();  
	}  
}
