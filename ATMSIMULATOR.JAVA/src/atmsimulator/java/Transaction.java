
package atmsimulator.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Transaction extends JFrame implements ActionListener {
    
    JButton deposit,withdraw,fastcash,pinchange,balance,exit,mini;
    String pinno;
    Transaction(String pinno){
        this.pinno=pinno;
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(230,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Systemm", Font.BOLD, 16));
        image.add(text);
        
         deposit =new JButton("DEPOSITE");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
         withdraw =new JButton("CASH WITHDRAWL");
        withdraw.setBounds(355,415,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
         fastcash =new JButton(" FAST CASH");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
         mini =new JButton("MINI STATEMENT");
        mini.setBounds(355,450,150,30);
        mini.addActionListener(this);
        image.add(mini);
        
         pinchange =new JButton("PIN CHANGE"); 
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balance =new JButton("BALANCE ENQUIRY");
        balance.setBounds(355,485,150,30);
        balance.addActionListener(this);
        image.add(balance);
        
         exit =new JButton("EXIT");
        exit.setBounds(355,520,150,30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        
      
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == exit)
        {
            System.exit(0);
        }else if(ae.getSource() == deposit){
            setVisible(false);
            new Deposite(pinno).setVisible(true);
        }else if(ae.getSource() == withdraw)
        {
            setVisible(false);
            new Withdrawl(pinno).setVisible(true);
            
        }  else if(ae.getSource() == fastcash)   {
            setVisible(false);
            new Fastcash(pinno).setVisible(true);
        }   
        else if(ae.getSource() == pinchange){
            setVisible(false);
            new Pinchange(pinno).setVisible(true);
        }   
        else if(ae.getSource() == mini){
            setVisible(false);
            new MiniStatement(pinno).setVisible(true);
        }else if(ae.getSource()== balance){
            setVisible(false);
            new BalanceEnquiry(pinno).setVisible(true);
        }
    }


    public static void main(String args[]) {
        new Transaction(" ");
      
    }
}
