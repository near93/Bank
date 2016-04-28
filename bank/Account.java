/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author Gelen
 */
public class Account extends JFrame implements ActionListener{
    
    JButton withdrawBtn, depositBtn;
    JLabel test;
    
    public Account(){
        super("My Account");
        OpenAccount getAccInfo = new OpenAccount();
        List accInfo = new ArrayList();
        accInfo = getAccInfo.accInfoList();
        
        for (int i = 0; i < accInfo.size(); i++){
            System.out.println("It works!"+accInfo.get(i));
        }
        
        //test = new JLabel("" + accInfo);
        /*for (int i = 0; i < accInfo.size(); i++){
            test = new JLabel();
            test.setText(""+accInfo.get(i));
        }*/

        this.depositBtn = new JButton("Deposit");
        this.withdrawBtn = new JButton("Withdraw");

        this.setLayout(null);
        withdrawBtn.setBounds(20, 20, 125, 30);
        depositBtn.setBounds(200, 20, 125, 30);
        test.setBounds(20, 50, 125, 30);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /*openAccBtn.addActionListener(new Bank.openAccount());
        selectAccBtn.addActionListener(new Bank.selectAccount());*/
        
        add(withdrawBtn);
        add(depositBtn);
        add(test);
        
        setSize(350, 445);
        setLocation(100,100);
        setVisible(true);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    public static void main (String[] args){
        new Account();

    }
}
