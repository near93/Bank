package bank;

import java.awt.event.*;
import javax.swing.*;

public class OpenAccount extends JFrame implements ActionListener{
    public int accNum, initialBal, depositVal, withdrawVal;

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
        
        addAccBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                //ArrayList<ArrayList<Integer>> acclist = new ArrayList<ArrayList<Integer>>();   
                accNum = Integer.parseInt(accNumField.getText());
                initialBal = Integer.parseInt(initialBalField.getText()); 
                
                accNumTxt.setText("" + accNum);
                initialBalTxt.setText("" + initialBal);
            }  
        });
        
        
        setSize(350, 445);
        setLocation(100,100);
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
    public void main (String args[]){
        new OpenAccount();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
