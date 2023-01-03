import javax.swing.*;
import java.sql.ResultSet;

public class output extends JFrame {
    output(String StudentID){

        JFrame f1=new JFrame();
        f1.setTitle("Student Info");
        f1.setLayout(null);

        JLabel n = new JLabel("Name:");
        n.setBounds(20, 20, 100, 30);
        f1.add(n);

        JLabel name = new JLabel();
        name.setBounds(200, 20, 100, 30);
        f1.add(name);

        JLabel a = new JLabel("Admission date:");
        a.setBounds(20, 60, 100, 30);
        f1.add(a);

        JLabel admission = new JLabel();
        admission.setBounds(200, 60, 100, 30);
        f1.add(admission);

        JLabel f = new JLabel("Fees:");
        f.setBounds(20, 100, 100, 30);
        f1.add(f);

        JLabel fees = new JLabel();
        fees.setBounds(200, 100, 100, 30);
        f1.add(fees);

        JLabel P = new JLabel("Pass in Semester's:");
        P.setBounds(20, 140, 150, 30);
        f1.add(P);

        JLabel Pass = new JLabel();
        Pass.setBounds(200, 140, 100, 30);
        f1.add(Pass);

        JLabel K = new JLabel("KT in semester's:");
        K.setBounds(20, 180, 100, 30);
        f1.add(K);

        JLabel Kt = new JLabel();
        Kt.setBounds(200, 180, 100, 30);
        f1.add(Kt);

        try {
            Conn c = new Conn();

            ResultSet rs = c.s.executeQuery("select * from studinfo where studid='"+StudentID+"'");
            while (rs.next()) {
                name.setText( name.getText() +  "<html>" +"&nbsp;"  +rs.getString("name"));
            }
            ResultSet r = c.s.executeQuery("select * from studinfo where studid='"+StudentID+"'");
            while (r.next()) {
                admission.setText( admission.getText() +  "<html>" +"&nbsp;"  +r.getString("admission"));
            }
            ResultSet s = c.s.executeQuery("select * from studinfo where studid='"+StudentID+"'");
            while (s.next()) {
                fees.setText( fees.getText() +  "<html>" +"&nbsp;"  +s.getString("fees"));
            }
            ResultSet sr = c.s.executeQuery("select * from studinfo where studid='"+StudentID+"'");
            while (sr.next()) {
                Pass.setText( Pass.getText() +  "<html>" +"&nbsp;"  +sr.getString("pass"));
            }
            ResultSet rr = c.s.executeQuery("select * from studinfo where studid='"+StudentID+"'");
            while (rr.next()) {
                Kt.setText( Kt.getText() +  "<html>" +"&nbsp;"  +rr.getString("kt"));
            }


        } catch (Exception e) {
            System.out.println(e);
        }

        f1.setSize(400, 300);
        f1.setLocation(570, 200);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        new output(" ");
    }
}
