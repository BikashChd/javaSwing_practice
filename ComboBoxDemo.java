package javaswing;
//JComboBox
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ComboBoxDemo implements ActionListener
{
static JComboBox cb1;
static JLabel lbl;
static JButton btn;
static Container c;
static JLabel lbl1;

public static void main(String [] args)
{
 	 JFrame frame = new JFrame("ComboBox Demo");
	 frame.setBounds(100,100,500,500);
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 c = frame.getContentPane();
	 c.setLayout(null);
	 
	 String [] arr = {"SLC", "PCL", "Bachelors", "Masters"};
	 cb1 = new JComboBox(arr);
	 cb1.setBounds(100,100,100,30);
	 
     cb1.setEditable(true);
	 //cb1.setSelectedIndex(2);
	 cb1.setSelectedItem("PCL");
	 cb1.addItem("PhD");
	 cb1.insertItemAt("Primary",0);
	 cb1.removeItem("phD");
	 
	 lbl = new JLabel("Selected Box Item");
	 lbl.setBounds(100,160, 300,30);
	 	  
	 btn = new JButton("Display");
	 btn.setBounds(250,100,150,30);
	 
	 btn.addActionListener(new ComboBoxDemo());
	 lbl1 = new JLabel();
	 lbl1.setBounds( 300,150,100,30);
	 
	 c.add(cb1);
	 c.add(lbl);
	 c.add(btn);
	 c.add(lbl1);
	 c.revalidate();
}
public void actionPerformed(ActionEvent e)
{
    // lbl1.setText(Integer.toString(cb1.getSelectedIndex()));	  
     lbl1.setText((String)(cb1.getSelectedItem()));
	 
}

}
	 