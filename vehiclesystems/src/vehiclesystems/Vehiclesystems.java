
package vehiclesystems;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.sql.*;


public class Vehiclesystems extends JFrame implements ActionListener{
      JFrame f1=new JFrame();

    JLabel np;
    JTextField nps;
    JButton b1,b2;
    
    Vehiclesystems(String s){
        f1.setLayout(null);
        f1.setLocation(550,200);
        f1.setSize(300,300);
        f1.setTitle("Vehicle System");
        
        np=new JLabel("NoPlate:");
        np.setBounds(50,50,100,30);
        f1.add(np);
        
         nps = new JTextField();
        nps.setBounds(110,50,100,30);
        f1.add(nps);
        
         b1=new JButton("signin");
        b1.setBounds(20, 150, 100, 30);
        b1.addActionListener(this);
        f1.add(b1);
        
         b2=new JButton("signup");
        b2.setBounds(170, 150, 100, 30);
        b2.addActionListener(this);
        f1.add(b2);
                
        f1.setVisible(true);
    }
    
     @Override    
     public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            Conn c=new Conn();
            String Noplateno=nps.getText();
            
            String sql="select * from vehicle where noplate='"+Noplateno+"'";
            try{
              ResultSet rs=  c.s.executeQuery(sql);
              if(rs.next()){
                  setVisible(false);
                  new output(Noplateno).setVisible(true);
              }else if(Noplateno!=" "){
                  JOptionPane.showMessageDialog(null,"Plese Enter tghe Number Plate");
              }else {
                  JOptionPane.showMessageDialog(null,"InValid Number plate");
              }
            }catch(Exception e){
                System.out.println(e);
            }

        }
        if(ae.getSource()==b2){
            String Noplateno=nps.getText();
            setVisible(false);
            new signup(Noplateno).setVisible(true);
            
        }
    }
    public static void main(String[] args) {
        
        new Vehiclesystems(" ");
    }
    
}
