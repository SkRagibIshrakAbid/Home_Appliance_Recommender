package mypackage;

import java.text.SimpleDateFormat;  
import java.util.Date; 
import mypackage.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;



 public class TV{
   public TV() {
  String ename = Login.getName();
  JFrame f = new JFrame("TV"); //creating instance of JFrame
  JLabel l1=new JLabel("Result");  
    l1.setBounds(150, 200, 100, 30);

  JTextField t3 = new JTextField(20);

  JLabel l_length = new JLabel("Viewing distance(ft) :");
  f.setVisible(true);
  t3.setBounds(150, 235, 100, 30);
  l_length.setBounds(70, 235, 100, 30);
 
  JButton b1 = new JButton("Calculate");
  b1.setBounds(150, 355, 100, 30);
  JButton b2 = new JButton("View history");
  b2.setBounds(110, 400, 180, 30);
  JButton b3 = new JButton("Go back");
  b3.setBounds(110, 445, 180, 30);
  b3.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    new Actv();
	f.setVisible(false);
   }
   
   
  });
  
  
  
  
  b1.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    
	if (t3.getText().equals("") || t3.getText().equals(" ")) {
     JOptionPane.showMessageDialog(null, "Please Enter All Values", "OK", JOptionPane.INFORMATION_MESSAGE);
    } else {
     
	 

	String s3=t3.getText();
	float a =Float.parseFloat(s3);
	float d= a*12;
	float o= d/2;
	String res = String.valueOf(o);
	l1.setText(res+" inches");
	}
	try {
      File file = new File("dir//tv//" +Login.getName()+"tv.txt");
FileWriter myWriter = new FileWriter(file, true);
	  
	  String result = l1.getText();
	  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	  Date date = new Date();  
      myWriter.write(formatter.format(date)+"\r\n"+"Viewing distace is: "+t3.getText()+"\r\n"+"Result is: "+ result +"\r\n\n\n");
	  myWriter.close();
     } catch (IOException ex) {
      System.out.println("An error occurred.");
      ex.printStackTrace();
     }
	
	
	
	
	
   }
  });
  
  
    b2.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    new TvHistory();
   }
  });

   
  f.add(l_length);
  f.add(l1);
  f.add(t3);
  f.add(b1);
  f.add(b2);
  f.add(b3);
  f.setSize(400, 600); //400 width and 500 height  
  f.setLocationRelativeTo(null);
  f.setLayout(null); //using no layout managers 
  f.setVisible(true);
 }
}
