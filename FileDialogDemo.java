package javaswing;
import javax.swing.*;
import java.awt.Font;
import java.awt.FileDialog;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;

class FileDialogDemo implements ActionListener{
    JTextArea textArea1;
	JButton button1;
	JButton button2;
	JFrame f;
	
	FileDialogDemo(){
	f = new JFrame();
	f.setTitle("Text Editor - Untitled");
	f.setSize(800, 700);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLayout(null);

    textArea1 = new JTextArea();
	button1 = new JButton("Open");
	button2 = new JButton("Save");
	textArea1.setFont(new Font("Book Antiqua", Font.PLAIN, 17));
	textArea1.setBounds(50, 50, 700, 500);
	button1.setBounds(650, 560, 100, 30);
	button2.setBounds(650, 600, 100, 30);

	f.add(textArea1);
	f.add(button1);
	f.add(button2);
	button1.addActionListener(this);
	button2.addActionListener(this);
		
	}
     
public void actionPerformed(ActionEvent ae)
{
   if(ae.getSource()==button1) 
   {
	textArea1.setText("");
	FileDialog fileDialog = new FileDialog(f,"Open Dialog", FileDialog.LOAD);
	fileDialog.setVisible(true);
	String directoryName = fileDialog.getDirectory();
	String fileName = fileDialog.getFile();
	f.setTitle(directoryName+fileName);
	if(directoryName != null){
	 try{
	    BufferedReader reader = new  BufferedReader(new FileReader(directoryName+fileName));
	    String line = reader.readLine();
	    while(line != null){
	 	textArea1.append(line+"\n");
		line = reader.readLine();
	   }
	   reader.close();
	}
	catch(Exception er){ 
	  er.printStackTrace();
	  }
	}
   }
  else 
	{
	 FileDialog fileDialog = new FileDialog(f, "Save Dialog", FileDialog.SAVE);
	 fileDialog.setVisible(true);
	 String directoryName = fileDialog.getDirectory();
	 String fileName = fileDialog.getFile();
	 String data = textArea1.getText();
	 try{
		BufferedWriter writer = new BufferedWriter(new FileWriter(directoryName+fileName));
		writer.write(data);
		writer.flush();
		writer.close();
	}
	catch(Exception exe){ exe.printStackTrace(); }
	
	}
}

public static void main(String[] args){
     		new FileDialogDemo();
	}
}