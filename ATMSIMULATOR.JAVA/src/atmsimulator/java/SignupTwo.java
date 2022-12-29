
package atmsimulator.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;



public class SignupTwo extends JFrame implements ActionListener {
    
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion,category,income,education,occupation;
    String formno;
    
    
    SignupTwo(String formno){
        this.formno=formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
               
               
        JLabel additionaldetail= new JLabel("PAGE 2:ADDITIONAL DETAILS");
        additionaldetail.setFont(new Font("Raleway" ,Font.BOLD,22));
        additionaldetail.setBounds(290,80,400,40);
        add(additionaldetail);
        
        JLabel name= new JLabel("Religion:");
        name.setFont(new Font("Raleway" ,Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String vaiReligion[]= {"Hindu", "Muslim", "Sikh","Chritian ", "Others"};
          religion = new JComboBox(vaiReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel fname= new JLabel("CATEGORY:");
        fname.setFont(new Font("Raleway" ,Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
         String vaiCategory[]= {"General", "OBC", "SC","ST ", "Others"};
          category = new JComboBox(vaiCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
       
        JLabel dob= new JLabel(" INCOME:");
        dob.setFont(new Font("Raleway" ,Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
         String incomeCategory[]= {"NULL", "<1,50,000", "<2,50,000","<5,00,000 ", "Upto 10,00,000"};
          income = new JComboBox(incomeCategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
            
        
        JLabel gender= new JLabel(" EDUCATIONAL:");
        gender.setFont(new Font("Raleway" ,Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
                
       
        JLabel email= new JLabel(" QUALIFICATION:");
        email.setFont(new Font("Raleway" ,Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
         String educationalvalues[]= {"Non-Graduate", "Graduate", "Post-Graduate","Doctrate ", "Others"};
          education = new JComboBox(educationalvalues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
            
        
        JLabel marital= new JLabel("OCCUPATION");
        marital.setFont(new Font("Raleway" ,Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
         String Occupationalvalues[]= {"Salaried", "Self-Employed", "Bussiness","Student ", "Retried","Others"};
          occupation = new JComboBox(Occupationalvalues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        JLabel address= new JLabel(" Email:");
        address.setFont(new Font("Raleway" ,Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
         pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        JLabel city= new JLabel(" AADHAR NO:");
        city.setFont(new Font("Raleway" ,Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
         aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
       
        JLabel state= new JLabel(" SENIOR CITIZEN:");
        state.setFont(new Font("Raleway" ,Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        
        
          syes = new JRadioButton("YES");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
         sno = new JRadioButton("NO");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
       
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
      
        
        JLabel pincode= new JLabel(" EXISTING ACCOUNT:");
        pincode.setFont(new Font("Raleway" ,Font.BOLD,20));
        pincode.setBounds(100,590,300,30);
        add(pincode);
        
          eyes = new JRadioButton("YES");
        eyes.setBounds(310,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
         eno = new JRadioButton("NO");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
       
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
      
        
        next = new JButton("Next");
        next.setBackground(Color.BLUE);
        next.setForeground(Color.YELLOW);
        next.setFont(new Font("Raleway", Font.BOLD, 14 ));
        next.setBounds(620,640,80,30);
        next.addActionListener(this);
        add(next);
        
                
                

        
        
        
               
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
        
       
        
        
    }
    
     public static boolean isWord(String in){
        return Pattern.matches("[a-z0-9]{0,20}[.]{0,1}[0-9a-z]{0,20}[.]{0,1}[@][a-z]{0,20}[.][a-z]{0,20}[.]{0,1}[a-z]{0,20}[.]{0,1}+", in);
    }
     
    
     
     
public  void actionPerformed(ActionEvent ae){
    String sreligion = (String)religion.getSelectedItem();
     String scategory = (String)category.getSelectedItem();
     String sincome = (String)income.getSelectedItem();
     String seducation = (String)education.getSelectedItem();
     String soccupation =(String)occupation.getSelectedItem();
   
     String seniorcitizen=null;
     if(syes.isSelected())
             {
                 seniorcitizen="YES";
             }
     else if (sno.isSelected()){
         seniorcitizen="NO";
     }
     String existingaccount=null;
     if(eyes.isSelected()){
         existingaccount="YES";
     }
     else if(eno.isSelected()){
         existingaccount="NO";
         
     }
      String span = pan.getText();
      
           String saadhar = aadhar.getText();
       if(saadhar.matches("[0-9]{12}"))
       {
           
       }
      
         try{
             if (!isWord(span))
             {
                 JOptionPane.showMessageDialog(null, "Enter Valid Email");
             }else if(saadhar.equals("")){
              JOptionPane.showMessageDialog(null, "Addhar is Required");
         }else if(!saadhar.matches("[0-9]{12}")){
             
             JOptionPane.showMessageDialog(null, "Please enter valid addhar no");
         }else{
                 conn c = new conn();
                 
                 String query="Insert into signuptwo values ('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
        
             c.s.executeUpdate(query);
             // Sinup3 object
             setVisible(false);
             new SignupThree(formno).setVisible(true);}
            
         }catch (Exception e){
             System.out.println(e);
                     
         }
    
    
}
    public static void main(String args[]) {
        new SignupTwo(" ");
        
    }
}

