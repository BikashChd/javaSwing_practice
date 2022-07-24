package javaswing;
//TableFrame.java
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.*;


class TableFrame extends JFrame {
	
public TableFrame()
    {

	this.setLayout(new BorderLayout());
	
	// Initialize column headings
	final String[] colHeads = { "Name", "Phone", "Fax" };
	
	// Initialize data
	final String[][] data = {
		{ "Ram", "4567", "8675" }, { "Kiran", "4567", "8675" },
		{ "Pashang", "4567", "8675" },{ "Uma", "4567", "8675" }};
	// Create the table
	JTable table = new JTable(data, colHeads);

	// Add table to a scroll pane
	int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
	int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

	JScrollPane scrollPane = new JScrollPane(table, v, h);

	// Add scroll pane to Frame
	this.add(scrollPane, BorderLayout.CENTER);
	}
}

public class TableDemo
{
   public static void main( String[] args )
   { 
      TableFrame tableFrame = new TableFrame();  
      tableFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      tableFrame.setSize( 250, 200 ); // set frame size
      tableFrame.setVisible( true ); // display frame
   } // end main
} // end class Table

