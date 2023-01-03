import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class student extends JFrame implements ActionListener {

    JLabel  studID, password;
    JTextField  st;

    JPasswordField  pa;
    JButton login,signup;
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

        password = new JLabel("Password");
        password.setBounds(20, 120, 100, 30);
        F1.add(password);

        pa = new JPasswordField();
        pa.setBounds(100, 120, 100, 30);
        F1.add(pa);



        login = new JButton("Signin");
        login.setBounds(20, 200, 100, 30);
        login.addActionListener(this);
        F1.add(login);

        signup = new JButton("SignUp");
        signup.setBounds(170, 200, 100, 30);
        signup.addActionListener(this);
        F1.add(signup);


        F1.setSize(300, 300);
        F1.setLocation(600, 200);
        F1.setVisible(true);
    }


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
                    JOptionPane.showMessageDialog(null,"incorrect StudentID or Password");
                }


            }catch(Exception e){
                System.out.println(e);
            }
        }
        if(ae.getSource()==signup){
            String StudentID=st.getText();

            setVisible(false);
            new signup(StudentID).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new student(" ");
    }
}