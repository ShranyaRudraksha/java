
package atmsimulator.java;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.util.regex.*;
import com.toedter.calendar.JDateChooser;


public class SignupOne extends JFrame implements ActionListener {
    
    long random;
    JTextField nameTextField, fnameTextField, dobTextField,  addressTextField, cityTextField, pinTextField;
    JButton next;
    JRadioButton male, female, other, married, unmarried;
    JDateChooser datechooser;
    JLabel text;
    JComboBox states;
    
    
    
    SignupOne(){
        
        Random ran = new Random();
         random = Math.abs((ran.nextLong() % 9000L)+ 1000L);
        
          JLabel formno= new JLabel("APPLICATION FORM NO." + random);
        formno.setFont(new Font("Raleway" ,Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel persondetail= new JLabel("PAGE 1:PERSONAL DETAILS");
        persondetail.setFont(new Font("Raleway" ,Font.BOLD,22));
        persondetail.setBounds(290,80,400,40);
        add(persondetail);
        
        JLabel name= new JLabel("NAME:");
        name.setFont(new Font("Raleway" ,Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        text = new JLabel();
        text.setFont(new Font("Raleway", Font.BOLD, 14));
        text.setBounds(800,140,400,30);
        add(text);
        
       
        
        JLabel fname= new JLabel(" FATHER'S NAME:");
        fname.setFont(new Font("Raleway" ,Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob= new JLabel(" Date of Birth:");
        dob.setFont(new Font("Raleway" ,Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        datechooser = new JDateChooser();
        datechooser.setBounds(300,240,400,30);
        datechooser.setForeground( new Color(105,105,105));
        add(datechooser);
            
        
        JLabel gender= new JLabel(" Gender:");
        gender.setFont(new Font("Raleway" ,Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        other = new JRadioButton("Others");
        other.setBounds(600,290,190,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);
        
       
       /* JLabel email= new JLabel(" Email Address:");
        email.setFont(new Font("Raleway" ,Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);*/
        
        JLabel marital= new JLabel(" Marital Status");
        marital.setFont(new Font("Raleway" ,Font.BOLD,20));
        marital.setBounds(100,340,200,30);
        add(marital);
        
         married = new JRadioButton("Married");
        married.setBounds(300,340,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
         unmarried = new JRadioButton("unmarried");
        unmarried.setBounds(450,340,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
         other = new JRadioButton("other");
        other.setBounds(630,340,100,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
         
        JLabel address= new JLabel(" Address:");
        address.setFont(new Font("Raleway" ,Font.BOLD,20));
        address.setBounds(100,390,200,30);
        add(address);
        
         addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300,390,400,30);
        add(addressTextField);
        
        JLabel city= new JLabel(" City:");
        city.setFont(new Font("Raleway" ,Font.BOLD,20));
        city.setBounds(100,440,200,30);
        add(city);
        
         cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300,440,400,30);
        add(cityTextField);
       
        JLabel state= new JLabel(" State:");
        state.setFont(new Font("Raleway" ,Font.BOLD,20));
        state.setBounds(100,490,200,30);
        add(state);
        
         String vaiReligion[]= {"Andra Pradesh", "Arunachal Pradesh", "Assam","Bihar ", "Chhattisgarh","Goa ","Gujarat ","Haryana ","Himachal Pradesh ","Jammu Kashmir ","Jharkhand ","Karnataka ","Kerela ","Madhya Pradesh ","Maharashtra ","Manipur ","Meghalaya ","Mizoram ","Nagaland ","Odhisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"};
          states = new JComboBox(vaiReligion);
        states.setBounds(300,490,400,30);
        states.setBackground(Color.WHITE);
        add(states);
        
        JLabel pincode= new JLabel(" Pincode:");
        pincode.setFont(new Font("Raleway" ,Font.BOLD,20));
        pincode.setBounds(100,540,200,30);
        add(pincode);
        
         pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField.setBounds(300,540,400,30);
        add(pinTextField);
        
        next = new JButton("Next");
        next.setBackground(Color.BLUE);
        next.setForeground(Color.YELLOW);
        next.setFont(new Font("Raleway", Font.BOLD, 14 ));
        next.setBounds(620,590,80,30);
        next.addActionListener(this);
        add(next);
        
                
                

        
        
        
               
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
             
    }
    
    public static boolean isWord(String in){
        return Pattern.matches("[A-Za-z]{0,20}[ ][A-Za-z]{0,20}[ ]{0,1}[A-Za-z]{0,20}+", in);
    }
    
   
public  void actionPerformed(ActionEvent ae){
    String formno = "" + random;
    String name = nameTextField.getText();
    
        
    
     String fname = fnameTextField.getText(); 
     String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
     String gender = null;
     if(male.isSelected())
             {
                 gender="Male";
             }
     else if (female.isSelected()){
         gender="Female";
     }
     
     String marital=null;
     if(married.isSelected()){
         marital="Married";
     }
     else if(unmarried.isSelected()){
         marital="Unmaried";
         
     }else if(other.isSelected()){
         marital="Other";
         
     }
      String address = addressTextField.getText();
       String city = cityTextField.getText();
String state = (String)states.getSelectedItem();
String pin =pinTextField.getText();
         
         
         
         try{if(name.equals("")){
              JOptionPane.showMessageDialog(null, "Name is Required");
         }else
             if (!isWord(name))
             {
                 JOptionPane.showMessageDialog(null, "Enter Valid Name");
             }else if (!isWord(fname))
             {
                 JOptionPane.showMessageDialog(null, "Enter Valid Father's Name");
             }else if(address.equals("")){
              JOptionPane.showMessageDialog(null, "Address is Required");
         }else if(pin.equals("")){
              JOptionPane.showMessageDialog(null, "Pin is Required");
         }else
             {
                 conn c = new conn();
                 
                 String query="Insert into signup values ('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
        
             c.s.executeUpdate(query);
             
             setVisible(false);
             new SignupTwo(formno).setVisible(true);
             }
         }catch (Exception e){
             System.out.println(e);
                     
         }
    
    
}
    public static void main(String args[]) {
        new SignupOne();
        
    }
}

