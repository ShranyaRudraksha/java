
package atmsimulator.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LOGIN extends JFrame implements ActionListener{
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
     LOGIN(){
         
         
       
        setTitle("ATM SIMULATOR");
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("osward",Font.BOLD, 38));
        text.setBounds(200,50,400,40);
        add(text);
        
          JLabel cardno = new JLabel("CARD NO:");
        cardno.setFont(new Font("Raleway",Font.BOLD, 34));
       
        cardno.setBounds(120,150,400,40);
        
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,400,40);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
          JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD, 38));
        pin.setBounds(200,220,250,40);
        
        add(pin);
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,250,40);
        add(pinTextField);
        
     login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLUE);
        login.setForeground(Color.YELLOW);
        login.addActionListener(this);
        add(login);
        
       clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLUE);
        clear.setForeground(Color.YELLOW);
        clear.addActionListener(this);
        add(clear);
        
         signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLUE);
        signup.setForeground(Color.YELLOW);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground( Color.WHITE);
        
        setSize(800, 500);
        setVisible(true);
        setLocation(350, 200);

    
}
     public void actionPerformed(ActionEvent ae){
         if (ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
             
         }
         else  if(ae.getSource() == login){
             conn conn = new conn();
             String cardno = cardTextField.getText();
             String pinno = pinTextField.getText();
             String query  = "select * from login where cardno ='"+cardno+"'and pin ='"+pinno+"'";
             try {
                 ResultSet  rs =conn.s.executeQuery(query);
                 if(rs.next()){
                     setVisible(false);
                     new Transaction(pinno).setVisible(true);
                 }else{
                     JOptionPane.showMessageDialog(null, "Incorrect Card no or Pin");
                 }
             }catch(Exception e){
                 System.out.println(e);
             }
         }else  if(ae.getSource() == signup){
             setVisible(false);
             new SignupOne().setVisible(true);
         }
     }
    public static void main(String args[]){
        new LOGIN();
        
    }
    
}
