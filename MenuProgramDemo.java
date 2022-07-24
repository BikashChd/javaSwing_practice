package javaswing;

import javax.swing.*;
import java.awt.*;


class MenuProgramDemo
{
    public static void main(String [] args)
    {
    	JFrame fr = new JFrame("Menu Demo");
        fr.setBounds(10,10,500,500);
	    fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     	JMenuBar mb = new JMenuBar();
	    fr.setJMenuBar(mb);
        
        JMenu file = new JMenu("File");
        mb.add(file);
	
	    JMenuItem new_item = new JMenuItem("New");
        file.add(new_item);
	
	    JMenuItem open = new JMenuItem("Open");
        file.add(open);
        
	    JMenuItem save = new JMenuItem("Save");
        file.add(save);

    	JMenu save_as = new JMenu("Save As");
        file.add(save_as);
        
        JMenuItem save_pdf = new JMenuItem("Save As PDf");
        save_as.add(save_pdf);
        JMenuItem save_ppt = new JMenuItem("Save As PPT");
        save_as.add(save_ppt);
        JMenu save_image = new JMenu("Save As Image");
        save_as.add(save_image);

        JMenuItem png = new JMenuItem("PNG Image");
        save_image.add(png);
        JMenuItem jpeg = new JMenuItem("JPEG Image");
        save_image.add(jpeg);


        JMenu edit = new JMenu("Edit");
        mb.add(edit);
        
        JRadioButtonMenuItem copy = new JRadioButtonMenuItem("Copy");
        edit.add(copy);
	    JRadioButtonMenuItem cut = new JRadioButtonMenuItem("cut");
	    edit.add(cut);

	    ButtonGroup bgroup = new ButtonGroup();
	    bgroup.add(copy);
	    bgroup.add(cut);

        JMenu insert = new JMenu("Insert");
        mb.add(insert);

    	JCheckBoxMenuItem image = new JCheckBoxMenuItem("Image");
	    insert.add(image);
	    JCheckBoxMenuItem shape = new JCheckBoxMenuItem("Shape");
	    insert.add(shape);
        JCheckBoxMenuItem chart = new JCheckBoxMenuItem("Chart");
	    insert.add(chart);
	    JCheckBoxMenuItem art = new JCheckBoxMenuItem("Art");
	    insert.add(art);

        
        JMenu help = new JMenu("Help");
        mb.add(help);


	
    }
}