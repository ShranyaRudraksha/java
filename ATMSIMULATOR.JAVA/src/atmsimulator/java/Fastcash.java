
package atmsimulator.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class Fastcash extends JFrame implements ActionListener {
    
    JButton deposit,withdraw,mini,pin,balance,exit;
    String pinno;
    Fastcash(String pinno){
        this.pinno=pinno;
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Select withdrawl amount");
        text.setBounds(230,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Systemm", Font.BOLD, 16));
        image.add(text);
        
         deposit =new JButton("Rs 100");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
         withdraw =new JButton("Rs 500");
        withdraw.setBounds(355,415,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        /* c =new JButton(" Rs 1000");
        c.setBounds(170,450,150,30);
        c.addActionListener(this);
        image.add(c);*/
        
         mini =new JButton("Rs 2000");
        mini.setBounds(170,450,150,30);
        mini.addActionListener(this);
        image.add(mini);
        
         pin =new JButton("Rs 5000"); 
        pin.setBounds(355,450,150,30);
        pin.addActionListener(this);
        image.add(pin);
        
        balance =new JButton("Rs 10000");
        balance.setBounds(170,485,150,30);
        balance.addActionListener(this);
        image.add(balance);
        
         exit =new JButton("BACK");
        exit.setBounds(355,485,150,30);
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
            setVisible(false);
            new Transaction(pinno).setVisible(true);
        }else {
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            conn c = new conn();
            try{
                ResultSet rs = c.s.executeQuery("Select * from bank where pin = '"+pinno+"'");
                int balance= 0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposite")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                    
                }
                if(ae.getSource() != exit && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                
                Date date = new Date();
                String query="insert into bank values('"+pinno+"','"+date+"','Withdrawl','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Debite Sucessfully");
                
                setVisible(false);
                new Transaction(pinno).setVisible(true);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
    }


    public static void main(String args[]) {
        new Fastcash(" ");
      
    }
}
