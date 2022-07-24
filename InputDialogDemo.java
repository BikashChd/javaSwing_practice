package javaswing;

// Illustrates concatenation operation in output statements

import javax.swing.JOptionPane;

public class InputDialogDemo
{
  public static void main(String[] args)
  {
    int x, y;
    double a, b;
    String s1, s2;

    s1 = JOptionPane.showInputDialog("Please enter an integer:");
    s2 = JOptionPane.showInputDialog("Please enter another integer:");
    x = Integer.parseInt(s1);
    y = Integer.parseInt(s2);
    
    String output = "The sum of your two integers:\n"
                + x + " + " + y + " = " + (x + y);
    JOptionPane.showMessageDialog(null, output, "Result",
                                  JOptionPane.INFORMATION_MESSAGE);
  }
}