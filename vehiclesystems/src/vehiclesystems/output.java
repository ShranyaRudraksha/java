
package vehiclesystems;
import javax.swing.*;
import java.sql.*;

public class output extends JFrame{
    
    output(String Noplateno){
        JFrame f1=new JFrame();
        f1.setTitle("Vehicle info");
        f1.setLayout(null);

        JLabel n = new JLabel("Name:");
        n.setBounds(20, 20, 100, 30);
        f1.add(n);

        JLabel name = new JLabel();
        name.setBounds(200, 20, 100, 30);
        f1.add(name);

         JLabel a = new JLabel("DOB:");
         a.setBounds(20, 60, 100, 30);
         f1.add(a);

        JLabel admission = new JLabel();
        admission.setBounds(200, 60, 100, 30);
        f1.add(admission);

         JLabel f = new JLabel("Addhar NO:");
         f.setBounds(20, 100, 100, 30);
         f1.add(f);

        JLabel fees = new JLabel();
        fees.setBounds(200, 100, 100, 30);
        f1.add(fees);

         JLabel P = new JLabel("Address:");
         P.setBounds(20, 140, 150, 30);
         f1.add(P);

        JLabel Pass = new JLabel();
        Pass.setBounds(200, 140, 100, 30);
        f1.add(Pass);

         JLabel K = new JLabel("Phone NO:");
         K.setBounds(20, 180, 100, 30);
         f1.add(K);

        JLabel Kt = new JLabel();
        Kt.setBounds(200, 180, 100, 30);
        f1.add(Kt);
        
        JLabel MO= new JLabel("Model Name:");
         MO.setBounds(20, 220, 100, 30);
         f1.add(MO);

        JLabel m = new JLabel();
        m.setBounds(200, 220, 100, 30);
        f1.add(m);
        
        JLabel re= new JLabel("Resistration Date:");
         re.setBounds(20, 260, 150, 30);
         f1.add(re);

        JLabel v = new JLabel();
        v.setBounds(200, 260, 100, 30);
        f1.add(v);
        
        
        
        JLabel C = new JLabel("Center Name:");
         C.setBounds(20, 300, 100, 30);
         f1.add(C);

        JLabel cs = new JLabel();
        cs.setBounds(200, 300, 100, 30);
        f1.add(cs);
        
        JLabel cn = new JLabel("center NO:");
         cn.setBounds(20, 340, 100, 30);
         f1.add(cn);

        JLabel Cs = new JLabel();
        Cs.setBounds(200, 340, 100, 30);
        f1.add(Cs);
        

        try {
            Conn c = new Conn();

            ResultSet rs = c.s.executeQuery("select * from vehicle where noplate ='"+Noplateno+"'");
            while (rs.next()) {
                name.setText( name.getText() +  "<html>" +"&nbsp;"  +rs.getString("name"));
            }
            ResultSet r = c.s.executeQuery("select * from vehicle where noplate='"+Noplateno+"'");
            while (r.next()) {
                admission.setText( admission.getText() +  "<html>" +"&nbsp;"  +r.getString("DOB"));
            }
            ResultSet s = c.s.executeQuery("select * from vehicle where noplate='"+Noplateno+"'");
            while (s.next()) {
                fees.setText( fees.getText() +  "<html>" +"&nbsp;"  +s.getString("addhar"));
            }
            ResultSet sr = c.s.executeQuery("select * from vehicle where noplate='"+Noplateno+"'");
            while (sr.next()) {
                Pass.setText( Pass.getText() +  "<html>" +"&nbsp;"  +sr.getString("address"));
            }
            ResultSet rr = c.s.executeQuery("select * from vehicle where noplate='"+Noplateno+"'");
            while (rr.next()) {
                Kt.setText( Kt.getText() +  "<html>" +"&nbsp;"  +rr.getString("phone"));
            }
            ResultSet x = c.s.executeQuery("select * from vehicle where noplate='"+Noplateno+"'");
            while (x.next()) {
                m.setText( Kt.getText() +  "<html>" +"&nbsp;"  +x.getString("model"));
            }
            ResultSet y = c.s.executeQuery("select * from vehicle where noplate='"+Noplateno+"'");
            while (y.next()) {
                cs.setText( Kt.getText() +  "<html>" +"&nbsp;"  +y.getString("center"));
            }
            ResultSet z = c.s.executeQuery("select * from vehicle where noplate='"+Noplateno+"'");
            while (z.next()) {
                Cs.setText( Kt.getText() +  "<html>" +"&nbsp;"  +z.getString("cno"));
            }
            ResultSet vv = c.s.executeQuery("select * from vehicle where noplate='"+Noplateno+"'");
            while (vv.next()) {
                v.setText( Kt.getText() +  "<html>" +"&nbsp;"  +vv.getString("res"));
            }
            


        } catch (Exception e) {
            System.out.println(e);
        }

        f1.setSize(400, 450);
        f1.setLocation(570, 200);
        f1.setVisible(true);
        
    }
    public static void main(String [] s){
        new output(" ");
    }
    
}
