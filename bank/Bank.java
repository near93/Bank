package bank;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bank extends JFrame implements ActionListener{

    JButton openAccBtn = new JButton("Open Account");
    JButton selectAccBtn = new JButton("Select Account");
    
    public Bank(){
        super("Bank");
        this.setLayout(null);
        openAccBtn.setBounds(20, 20, 125, 30);
        selectAccBtn.setBounds(200, 20, 125, 30);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        openAccBtn.addActionListener(new openAccount());
        selectAccBtn.addActionListener(this);
        
        add(openAccBtn);
        add(selectAccBtn);
        
        setSize(350, 445);
        setLocation(100,100);
        setVisible(true);
    }
    
    class openAccount implements ActionListener{
        public void actionPerformed(ActionEvent e){
            new OpenAccount();
        }
    }
    
    public static void main (String args[]){
        new Bank();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
        /*ArrayList<String> accNumList = new ArrayList<String>();
        ArrayList<String> initialBalanceList = new ArrayList<String>();  
            
        String command;
            
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Commands: ");
        System.out.println("o - Open Account \t c - Close Account");
        System.out.println("d - Deposit \t\t w - Withdraw");
        System.out.println("s - Select Account \t q - Quit");
            
        do {
            String accNum;
            System.out.println("Enter Command: ");
            command = sc.nextLine();  

            if(command.equals("o")) {
                do {   
                    System.out.println("Enter account number: ");
                    accNumList.add(sc.next());
                    System.out.println("Enter Initial Balance: ");
                    initialBalanceList.add(sc.next()); 
                }
                
                while(command.equals("q"));    
            }
                
            else if(command.equals("s")){
                System.out.println("Enter Account Number: ");
                accNum = sc.nextLine();
                if(accNumList.contains(accNum)){
                    System.out.println("Account Number: " + accNum);
                    System.out.println("Initial Balance: " + initialBalanceList);
                }
                    
                else {
                    System.out.println("No account");
                }
            } 

            else {
                System.out.println("Invalid Command");
            }   
        }
            while (command.equals("q") && !command.equals("o") || !command.equals("c") || !command.equals("d") || !command.equals("w") || !command.equals("s"));
    */
