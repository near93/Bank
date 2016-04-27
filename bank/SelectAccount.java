/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Gelen
 */
public class SelectAccount extends JFrame implements ActionListener {

    JButton selectAccountBtn = new JButton("Select Account");
    
    JLabel t1 = new JLabel("Enter Account:");
    JTextField accNumField = new JTextField();
    
    
    public SelectAccount(){
        super("Select Account");
        this.setLayout(null);
        
        t1.setBounds(20,20,125,30);
        accNumField.setBounds(150,20,125,30);

        selectAccountBtn.setBounds(150,60,125,30);
        
        add(t1);
        add(accNumField);     
        add(selectAccountBtn);
        
        selectAccountBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

            }  
        });
        
        
        setSize(350, 445);
        setLocation(100,100);
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
    public void main (String args[]){
        new SelectAccount();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
