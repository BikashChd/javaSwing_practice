package javaswing;
import javax.swing.*; 
import java.awt.event.*;  

class RadioButtonDemo2 extends JFrame implements ActionListener{   
JRadioButton rb1,rb2, rb3;    
JLabel l1,l2;

RadioButtonDemo2(){ 
l1 = new JLabel("Please select the Course:");
l1.setBounds(50,40,200,30); 
rb1=new JRadioButton("BSc CSIT",true);
rb1.setBounds(100,100,100,30);  
//rb1.setActionCommand("csit"); 
rb1.addActionListener(this); 

rb2=new JRadioButton("BIM"); 
rb2.setBounds(200,100,100,30);
rb2.setActionCommand("bim"); 
rb2.addActionListener(this); 

rb3=new JRadioButton("BCA"); 
rb3.setBounds(300,100,100,30); 
rb3.setActionCommand("bca"); 
rb3.addActionListener(this); 
 
//adding buttons to button group 
ButtonGroup bg=new ButtonGroup();    
bg.add(rb1);
bg.add(rb2);
bg.add(rb3);  
l2 = new JLabel(); 
l2.setBounds(50,200,300,30); 
//adding componennts to frame  
add(l1);add(rb1);add(rb2);add(rb3);add(l2); 
setTitle("Courses Available"); 
setSize(500,300);     
setLayout(null);  
setVisible(true);  
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}     
public void actionPerformed(ActionEvent e){     
    String s = e.getActionCommand();  
    l2.setText("You have selected "+s+ " Program"); 
}   
public static void main(String args[]){ 
	RadioButtonDemo2 rbe =new RadioButtonDemo2();  
	}
}    
