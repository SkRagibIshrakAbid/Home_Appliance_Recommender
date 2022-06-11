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

public class Actv {
 public Actv() {
  JFrame f = new JFrame("Selection page");
  JButton b1 = new JButton("AC");
  b1.setBounds(145, 355, 110, 35);
  b1.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
	   new AC();
     f.setVisible(false);



   }
  });
  JButton b2 = new JButton("TV");
  b2.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {

new TV();
f.setVisible(false);



   }
  
  });
  b2.setBounds(145, 310, 110, 35);
  JButton b3 = new JButton("Log out");
  b3.setBounds(310, 0, 90, 30);
  b3.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {

new Login();
f.setVisible(false);

   }
  });
  f.add(b3);
  f.add(b1);
  f.add(b2);
  f.setSize(400, 600); //400 width and 500 height  
  f.setLayout(null); //using no layout managers 
  f.setLocationRelativeTo(null);
  f.setVisible(true);
 }
}
