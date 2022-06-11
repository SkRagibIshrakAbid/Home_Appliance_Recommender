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


public class NewAccount {
 public NewAccount() {
  JFrame f = new JFrame("Sign up"); //creating instance of JFrame
  JTextField t1 = new JTextField(20);
  JTextField t2 = new JTextField(20);
  JLabel l_name = new JLabel("Username :");
  JLabel l_pass = new JLabel("Password :");
  t1.setBounds(150, 270, 100, 30);
  l_name.setBounds(70, 270, 100, 30);
  t2.setBounds(150, 305, 100, 30);
  l_pass.setBounds(70, 305, 100, 30);
  JButton b1 = new JButton("Sign up");
  b1.setBounds(145, 355, 110, 30);
  b1.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    if (t1.getText().equals("") || t2.getText().equals("")) {
     JOptionPane.showMessageDialog(null, "Please Enter All Values", "OK", JOptionPane.INFORMATION_MESSAGE);
    } else {
     try {
      FileWriter myWriter = new FileWriter("dir//user//" + t1.getText() + ".txt");
      myWriter.write(t1.getText());
      myWriter.close();
     } catch (IOException ex) {
      System.out.println("An error occurred.");
      ex.printStackTrace();
     }
     try {
      FileWriter myWriter = new FileWriter("dir//pass//" + t1.getText() + "pass.txt");
      myWriter.write(t2.getText());
      myWriter.close();
      JOptionPane.showMessageDialog(null, "Sign up successful", "OK", JOptionPane.INFORMATION_MESSAGE);
      System.out.println("Successfully wrote to the file.");
     } catch (IOException ex) {
      System.out.println("An error occurred.");
      ex.printStackTrace();
     }
     new Login();
     f.setVisible(false);
    }
   }
  });
  f.add(l_name);
  f.add(t1);
  f.add(l_pass);
  f.add(t2);
  f.add(b1);
  f.setSize(400, 600); //400 width and 500 height  
  f.setLayout(null); //using no layout managers 
  f.setLocationRelativeTo(null);
  f.setVisible(true);
 }
}

