package javaswing;

//Example of JList with event handling  

import javax.swing.*; 
import javax.swing.event.*; 
public class JListDemo implements ListSelectionListener{  
    JFrame f = new JFrame("JList Demo"); 
    JList<String> jlst; 
    JLabel l;      
    JScrollPane p; 
    //creating an array of cities 
    String Cities[]={"Kathmandu","Pokhara","Hetauda","Birgunj", "Dharan","Biratnagar",
    "Butwal","Dhangadhi","Nepalgunj", "Damak","Dharan","Bharatpur","Janakpur","Itahari"};     void makeGUI(){ 
     jlst = new JList<String>(Cities);         //setting the list selection mode 
     jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
    //adding  the list to scroll pane      
    p = new JScrollPane(jlst);         //setting size of scroll pane 
    p.setSize(150, 200); 
    //making label that displays the selection    
     l = new JLabel("Choose a city"); 
   //adding selection listener for the list    
     jlst.addListSelectionListener(this); 
     //adding scroll pane  and label to frame 
        f.add(p);f.add(l); 
        f.setSize(400, 500); 
        f.setVisible(true); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         
    } 
    //handling list selection event 
    
  public void valueChanged(ListSelectionEvent lse){        
 //get the index of the changed item  
   int idx = jlst.getSelectedIndex();         //display selection if item was selected  
       if(idx!=-1) 
          l.setText("Current City : "+Cities[idx]);     
     else 
         l.setText("Choose a city"); 
 }

public static void main(String[] args) {    
     JListDemo jd = new JListDemo();       
     jd.makeGUI();
    } 
}  
