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


import java.nio.file.Files;
import java.nio.file.Paths;
public  class AcHistory 
{
	public AcHistory()
	{
	JFrame c=new JFrame("AcHistory");
	
    JTextArea t_add=new JTextArea(5,20);
	
	 String data[] = new String[100000];

	
	
	String text = ""; 
	try { text = new String(Files.readAllBytes(Paths.get("dir//ac//" +Login.getName()+"ac.txt"))); } 
	catch (IOException e) { e.printStackTrace(); }
	t_add.setText(text);
	t_add.setEditable(false);
	c.add(t_add);
	
	
	
	
	
		
		
      
        c.setLayout(new FlowLayout(FlowLayout.CENTER));
        c.setVisible(true);
		c.setLocationRelativeTo(null);
        c.setSize(235,600);
		
	}
   
}