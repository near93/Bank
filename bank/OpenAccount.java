package bank;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;

public class OpenAccount extends JFrame implements ActionListener{

    JButton addAccBtn = new JButton("Add Account");
    
    JLabel accNumTxt = new JLabel("Account Number: ");
    JTextField accNumField = new JTextField();
    
    JLabel initialBalTxt = new JLabel("Initial Balance: ");
    JTextField initialBalField = new JTextField();

    public OpenAccount(){
        super("Open Account");
        this.setLayout(null);
        
        accNumTxt.setBounds(20,20,125,30);
        accNumField.setBounds(150,20,125,30);

        initialBalTxt.setBounds(20,60,125,30);
        initialBalField.setBounds(150,60,125,30);
        
        addAccBtn.setBounds(150, 100, 125, 30);
        
        add(accNumTxt);
        add(accNumField);
        
        add(initialBalTxt);
        add(initialBalField);        
        add(addAccBtn);
        
        addAccBtn.addActionListener(this);

        setSize(350, 445);
        setLocation(100,100);
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
       
    /*public List<Integer> accInfoList(){
        
        List<Integer> accInfoList = new ArrayList<Integer>();
        accNum = Integer.parseInt(accNumField.getText());
        initialBal = Integer.parseInt(initialBalField.getText());  
        accInfoList.add(accNum, initialBal);
        
        return accInfoList;
    }*/
    
    @Override
    public void actionPerformed(ActionEvent e) {
        new Account();
    }

    List accInfoList() {
        List<String> accInfoList = new ArrayList<String>();
        /*int accNum = Integer.parseInt(accNumField.getText());
        int initialBal = Integer.parseInt(initialBalField.getText());*/
        /*accInfoList.addAll(Arrays.asList(accNum, initialBal));*/
        accInfoList.addAll(Arrays.asList(accNumField.getText(), initialBalField.getText()));
        return accInfoList;
    }

    public void main (String args[]){
        new OpenAccount();

    }
}
