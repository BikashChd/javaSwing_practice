package javaswing;

//Java JCheckBox Example:
import javax.swing.*;   
import java.awt.event.*;   
public class ChecBoxDemo2 extends JFrame implements ActionListener{   
  JLabel l;   
  JCheckBox cb1,cb2,cb3;    
  JButton b;      
  ChecBoxDemo2(){  
   setTitle("E-FOOD Service Nepal");    
   l=new JLabel("Please choose the food(s)to order");   
   l.setBounds(50,50,300,20);          
   cb1=new JCheckBox("Mo:Mo @ Rs.150");     
   cb1.setBounds(100,100,150,20);        
   cb2=new JCheckBox("Chow mein @ Rs.130");       
   cb2.setBounds(100,150,150,20);       
   cb3=new JCheckBox("Tea @ Rs.30");   
   cb3.setBounds(100,200,150,20);        
   b=new JButton("Order");   
   b.setBounds(100,250,80,30);   
   
   b.addActionListener(this);            
   add(l);add(cb1);add(cb2);add(cb3);add(b);           
   setSize(400,400);        
  setLayout(null);          
  setVisible(true);             
  setDefaultCloseOperation(EXIT_ON_CLOSE);   
  }   
public void actionPerformed(ActionEvent e){     
	float amount=0;      
	String msg="";      
	if(cb1.isSelected()){  
		amount+=150;             
		msg="Mo:Mo : Rs.150\n";   
     }  
	if(cb2.isSelected()){               
		amount+=130;  
		msg+="Chow mein : Rs.130\n";   
	}
	if(cb3.isSelected()){             
		amount+=30;         
		msg+="Tea: Rs.30\n";   
      }     
	msg+="-----------------\n";     
	msg+="\n Total:Rs."+amount; 
	//to show message in MessageDialog 
	JOptionPane.showMessageDialog(this, msg, "Your Orders", 
	JOptionPane.OK_CANCEL_OPTION);   
}
public static void main(String[] args) {      
	ChecBoxDemo2 order =   new ChecBoxDemo2();   
  }   
}   
