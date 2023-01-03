import javax.swing.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.toedter.calendar.JDateChooser;

public class signup extends JFrame {
    JLabel name,admission,fees,pass,kt,stud,pw;
    JTextField name1,fe,k,st,pa,p;
    JButton b3;

    JDateChooser am;

    signup(String StudentID) {


        JFrame f2 =new JFrame();
        f2.setLayout(null);
        f2.setLocation(550,200);
        f2.setSize(500,400);
        f2.setTitle("Resister form for Student");

        name=new JLabel("Name:");
        name.setBounds(30, 30, 100, 30);
        f2.add(name);

        name1=new JTextField();
        name1.setBounds(150,30,300,30);
        f2.add(name1);

        stud=new JLabel("Student ID :");
        stud.setBounds(30, 70, 100, 30);
        f2.add(stud);

        st=new JTextField();
        st.setBounds(150,70,300,30);
        f2.add(st);

        admission=new JLabel("Admission Date:");
        admission.setBounds(30, 110, 100, 30);
        f2.add(admission);

        am=new JDateChooser();
        am.setBounds(150,110,300,30);
        f2.add(am);

        fees=new JLabel("Fees Paid:");
        fees.setBounds(30, 150, 100, 30);
        f2.add(fees);

        fe=new JTextField();
        fe.setBounds(150,150,300,30);
        f2.add(fe);

        pass=new JLabel("Pass In Semester's:");
        pass.setBounds(30, 190, 150, 30);
        f2.add(pass);
        pa=new JTextField();
        pa.setBounds(150,190,300,30);
        f2.add(pa);

        kt=new JLabel("Kt In Semester's:");
        kt.setBounds(30, 230, 100, 30);
        f2.add(kt);

        k=new JTextField();
        k.setBounds(150,230,300,30);
        f2.add(k);

        pw=new JLabel("Password:");
        pw.setBounds(30, 270, 100, 30);
        f2.add(pw);

        p=new JTextField();
        p.setBounds(150,270,300,30);
        f2.add(p);


        b3= new JButton("submit");
        b3.setBounds(350,300,100,30);
        b3.addActionListener(this::actionPerformed);
        f2.add(b3);

        f2.setVisible(true);
    }


    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b3) {
            String name3 = name1.getText();
            String admi = ((JTextField) am.getDateEditor().getUiComponent()).getText();
            String no = fe.getText();
            String addd = pa.getText();
            String KTT = k.getText();
            String P = p.getText();
            String m = st.getText();
            String a2="^[0-8]{1}";
            Pattern p2=Pattern.compile(a2);
            Matcher m2=p2.matcher(addd);
            Matcher m1=p2.matcher(KTT);
            String a1="^[[a-z][0-9]]{6}";
            Pattern p1=Pattern.compile(a1);
            Matcher m3=p1.matcher(P);


            try {
                if (name3.equals(" ")) {
                    JOptionPane.showMessageDialog(null, "Name is Required");
                }
                else if (m.equals("")) {
                    JOptionPane.showMessageDialog(null, "Student ID is Required");
                }else if (admi.equals("")) {
                    JOptionPane.showMessageDialog(null, "Admission date is Required");
                } else if (no.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fess is Required");
                } else if (addd.equals("")) {
                    JOptionPane.showMessageDialog(null, "pass in semesters is Required");
                }else if(!m2.matches()){
                    JOptionPane.showMessageDialog(null,"Enter valid pass in semester's no");
                }
                else if (KTT.equals("")) {
                    JOptionPane.showMessageDialog(null, "KT in semesters is Required");
                }else if(!m1.matches()){
                    JOptionPane.showMessageDialog(null,"Enter valid pass in semester's no");
                } else if (P.equals("")) {
                    JOptionPane.showMessageDialog(null, "Password Date is Required");
                } else if(!m3.matches()){
                    JOptionPane.showMessageDialog(null,"Password limit is 6 no");
                }else  {
                    Conn c = new Conn();
                    String sql = "insert into studinfo values('" + name3 + "','" + m + "','" + admi + "','" + no + "','" + addd + "','" + KTT + "')";
                    String query = "insert into student values('" + m + "','" + P + "')";
                    c.s.executeUpdate(sql);
                    c.s.executeUpdate(query);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    public static void main(String[] args) {
        new signup("");
    }
}
