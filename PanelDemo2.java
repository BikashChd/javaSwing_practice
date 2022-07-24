package javaswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JPanelDemo2 implements ActionListener
{
   static Container c;
   static JPanel panel;
   static JButton btn1;
   static JPasswordField pswd;
   static JTextField name_ta;

   public static void main(String [] args)
   {
      JFrame fr = new JFrame("JPanel Demo ");
	  fr.setBounds(0,0,500,500);
	  fr.setVisible(true);
	  fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  c = fr.getContentPane();
	  c.setLayout(null);
	
	  panel = new JPanel();
	  panel.setLayout(null);
	  panel.setBounds(10,10,380,200);
	  panel.setBorder(BorderFactory.createLineBorder(Color.RED));
	  panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Login Panel"));
	  
	  JLabel l1 = new JLabel("Enter Username:");
	  l1.setBounds(20,10,150,30);
	  
	  name_ta = new JTextField("admin");
	  name_ta.setBounds(180,10,150,30);
	  
	  
	  JLabel l2 = new JLabel("Enter Password:");
	  l2.setBounds(20,60,150,30);
	  
	  pswd = new JPasswordField("password");
	  pswd.setBounds(180,60, 150,30);
	  	   
	   btn1 = new JButton("Login");
	   btn1.setBounds(150,120,80,30);
	   
	   btn1.addActionListener( new JPanelDemo2());
	   
	   panel.add(btn1);
	   panel.add(l1);
	   panel.add(l2);
	   panel.add(name_ta);
	   panel.add(pswd);
	   c.add(panel);
    
   }
   
   public void actionPerformed(ActionEvent e)
   {
       if(e.getSource()==btn1)
	   {
		   String s1= name_ta.getText();
		   @SuppressWarnings("deprecation")
		   String s2 = pswd.getText();
		   if(s1.equals("dabal") && s2.equals("dabal"))
		   {
			  JLabel m = new JLabel("Login Successful.");
			  m.setBounds(40,150,250,20);
			  panel.add(m);
			   
		   }
		   else{
		      JLabel msg = new JLabel("Wrong Username or Password.");
			  msg.setBounds(40,150,250,20);
			  panel.add(msg);
		   }
	   }
   }

}
