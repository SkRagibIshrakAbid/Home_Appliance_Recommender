package mypackage;

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



public class Login {
 public static String name;
 public Login() {
  JFrame f = new JFrame("Welcome"); //creating instance of JFrame
  JTextField t1 = new JTextField(20);
  JTextField t2 = new JTextField(20);
  JLabel l_name = new JLabel("Username :");
  JLabel l_pass = new JLabel("Password :");
  f.setVisible(true);
  t1.setBounds(150, 270, 100, 30);
  l_name.setBounds(70, 270, 100, 30);
  t2.setBounds(150, 305, 100, 30);
  l_pass.setBounds(70, 305, 100, 30);
  JButton b1 = new JButton("Login");
  b1.setBounds(160, 355, 80, 30);
  JButton b2 = new JButton("Create a new account");
  
  b1.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    File y = new File("dir//user//" + t1.getText() + ".txt");
    if (y.exists() && !y.isDirectory()) {
     int i = 0;
     String data[] = new String[10];
     try {
      File myObj = new File("dir//pass//" + t1.getText() + "pass.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
       data[i] = myReader.nextLine();
       i++;
      }
      myReader.close();

     } catch (FileNotFoundException t) {
      System.out.println("An error occurred.");
      //e.printStackTrace();
     }
     String ss = data[0];
     if (ss.equals(t2.getText())) {
      JOptionPane.showMessageDialog(null, "Login succesful", "OK", JOptionPane.INFORMATION_MESSAGE);
      
	  name= t1.getText();
	  
	  
	  new Actv();
      f.setVisible(false);
     } else {
      JOptionPane.showMessageDialog(null, "Wrong password", "OK", JOptionPane.INFORMATION_MESSAGE);
     }
    } else {
     JOptionPane.showMessageDialog(null, "user Not found", "OK", JOptionPane.INFORMATION_MESSAGE);
    }
   }
  });
  b2.setBounds(110, 400, 180, 30);
  b2.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    new NewAccount();
    f.setVisible(false);
   }
  });
  f.add(l_name);
  f.add(t1);
  f.add(l_pass);
  f.add(t2);
  f.add(b1);
  f.add(b2);
  f.setSize(400, 600); //400 width and 500 height  
  f.setLocationRelativeTo(null);
  f.setLayout(null); //using no layout managers 
  f.setVisible(true);
 }
 public static String getName() {
        return name;
    }
 
}



