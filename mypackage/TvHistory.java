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
public  class TvHistory 
{
	public TvHistory()
	{
	JFrame c=new JFrame("TvHistory");
	
    JTextArea t_add=new JTextArea(5,20);
	
	 String data[] = new String[100000];

	
	
	String text = ""; 
	try { text = new String(Files.readAllBytes(Paths.get("dir//tv//" +Login.getName()+"tv.txt"))); } 
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