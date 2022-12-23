import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class student extends JFrame implements ActionListener {

    JLabel name, studID, password;
    JTextField na, st, pa;
    JButton login;
    student(String s) {



        JFrame F1 = new JFrame();
        F1.setLayout(null);
        F1.setTitle("Student login");


        studID = new JLabel("Student ID");
        studID.setBounds(20, 70, 100, 30);
        F1.add(studID);

        st = new JTextField();
        st.setBounds(100, 70, 100, 30);
        F1.add(st);

        password = new JLabel("Name");
        password.setBounds(20, 120, 100, 30);
        F1.add(password);

        pa = new JTextField();
        pa.setBounds(100, 120, 100, 30);
        F1.add(pa);

        login = new JButton("LOGIN");
        login.setBounds(100, 200, 100, 30);
        login.addActionListener(this);
        F1.add(login);


        F1.setSize(300, 300);
        F1.setLocation(600, 200);
        F1.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            Conn c=new Conn();
            String StudentID=st.getText();
            String pass=pa.getText();
            String sql="select * from student where studid='"+StudentID+"'and pass='"+pass+"'";
            try{
              ResultSet rs=  c.s.executeQuery(sql);
              if(rs.next()){
                  setVisible(false);
                  new output(StudentID).setVisible(true);
              }else{
                  JOptionPane.showMessageDialog(null,"incorrect");
              }

            }catch(Exception e){
                System.out.println(e);
            }

        }
    }



        public static void main(String[] args) {
        new student(" ");
    }



}
