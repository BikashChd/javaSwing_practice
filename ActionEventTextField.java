package javaswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ActionEventTextField extends JFrame implements ActionListener {
  
	JTextField tf = new JTextField();
    ActionEventTextField()     {
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(50,50,500,500);
    this.setTitle("TextField ActionEvent");
    Container c = this.getContentPane();
    c.setLayout(null);
    tf.setBounds(20,20,200,30);
    tf.addActionListener(this);
    c.add(tf);
    Font f = new Font("Arial",Font.BOLD, 20);
    tf.setFont(f);
   }
    
   public void actionPerformed(ActionEvent e)    {
       String str = tf.getText();  
       String ntxt = str.toUpperCase();
       tf.setText(ntxt);
   }
   public static void main(String[] args)    {
      ActionEventTextField obj = new ActionEventTextField();
    } 
   
}
  
	

