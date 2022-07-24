package javaswing;

import javax.swing.*;
import java.awt.*;
class RadioButtonDemo  {
    public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(50,50,500,500);
    Container c = frame.getContentPane();
    c.setLayout(null);
    JRadioButton radio1 = new JRadioButton("Male");
    radio1.setBounds(50,50,70,50);
    JRadioButton radio2 = new JRadioButton("Feamle");
    radio2.setBounds(120,50, 100, 50);	
    ButtonGroup gender= new ButtonGroup();
    gender.add(radio1);
    gender.add(radio2);
    radio1.setSelected(true);
    //radio1.setEnabled(false);
    c.add(radio1);
    c.add(radio2);
    }    }
