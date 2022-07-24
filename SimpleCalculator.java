package javaswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {
            JLabel firstNumber, secondNumber, result, lblError;
	        JTextField txtFirst, txtSecond, txtResult;
	        JButton btnAdd, btnSub, btnClear;
	        Font f ;
	     
	        public SimpleCalculator()
	        {
	              
	            setSize(400,400);
	            setTitle("Action Event Demo");
	            setVisible(true);
	            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            
	        	f = new Font("Verdana", Font.BOLD, 16);
	                         
	              firstNumber = new JLabel("First Number: ");
	              secondNumber = new JLabel("Second Number: ");
	              result = new JLabel(" Result: ");
	              lblError = new JLabel();
	              txtFirst = new JTextField(20);
	              txtSecond = new JTextField(20);
	              txtResult = new JTextField(20);
	              btnAdd  = new JButton("+");
	              btnSub   = new JButton("-");
	              btnClear = new JButton("Clear");

	              firstNumber.setFont(f);
	              secondNumber.setFont(f);
	              result.setFont(f);

	              btnAdd.setFont(f);
	              btnSub.setFont(f);
	              btnClear.setFont(f); 
	             
	              btnAdd.addActionListener(this);
	              btnSub.addActionListener(this);
	              btnClear.addActionListener(this);   
	              
	             setLayout(null);
	          
	              firstNumber.setBounds(20,20,150,30);
	              txtFirst.setBounds(180,20,150,30);
	              secondNumber.setBounds(20,60,150,30);
	              txtSecond.setBounds(180,60,100,30);
	              result.setBounds(20,100,100,30);
	              txtResult.setBounds(130,100,100,30);
	              btnAdd.setBounds(50,180,60,30);
	              btnSub.setBounds(120,180,60,30);
	              btnClear.setBounds(190,180,80,30);
	              lblError.setBounds(120,200,250,30);

	           
	              add(firstNumber);
	              add(txtFirst);
	              add(secondNumber);
	              add(txtSecond);
	              add(result);
	              add(txtResult);
	              add(btnAdd);
	              add(btnSub);
	              add(btnClear);
	              add(lblError);
	}

	public void actionPerformed(ActionEvent ae)
	{
	            int a,b;  
	            String sr1, sr2;

	              try{

	                if(ae.getSource()==btnAdd)
	                   {
	                       
	                         sr1 = txtFirst.getText();
	                         sr2 = txtSecond.getText();
	                        a = Integer.parseInt(sr1);
	                        b = Integer.parseInt(sr2);
	                        int s = a + b;
	                       txtResult.setText(String.valueOf(s));
	                   }
	                   if(ae.getSource()==btnSub)
	                   {
	                       sr1 = txtFirst.getText();
	                       sr2 = txtSecond.getText();
	                        a = Integer.parseInt(sr1);
	                        b = Integer.parseInt(sr2);
	                        int d = a - b;
	                       txtResult.setText(String.valueOf(d));
	                   }
	              }
	             catch(NumberFormatException e)
	               {
	                     
	                      lblError.setFont(f);
	                      lblError.setBackground(Color.RED);
	                      lblError.setForeground(Color.YELLOW);
	                      lblError.setText("Error ! Enter the numbers first");
	                }
	             if( ae.getSource()==btnClear)
	               {
	                    txtFirst.setText("");
	                    txtSecond.setText("");
	                    txtResult.setText("");
	                    lblError.setText("");
	                    lblError.setBackground(Color.white);
	                    btnAdd.setBackground(Color.white);
	                    btnSub.setBackground(Color.white);
	                    btnClear.setBackground(Color.white);
	               }             
	      } // end of actionPerformed() method
	
	
	   public static void main(String [] args)
	   {
		   new SimpleCalculator();
	   }

	   } 

