
package vehiclesystems;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

import java.util.regex.*;

public class signup extends JFrame implements ActionListener{
    JLabel name,dob,numberplate,address,adh,phone,model,res,center,cno;
    JTextField name1,np,add,ad,md,ph,ct,cn;
    JButton b3;
    JDateChooser db,rs;
    JFrame f2 =new JFrame();
    signup(String Noplateno){
        
        f2.setLayout(null);
        f2.setLocation(550,200);
        f2.setSize(500,500);
        f2.setTitle("Resister form for vehicle");
        
         name=new JLabel("Name:");
        name.setBounds(30, 30, 100, 30);
        f2.add(name);
        
         name1=new JTextField();
        name1.setBounds(150,30,300,30);
        f2.add(name1);
        
         dob=new JLabel("DOB:");
        dob.setBounds(30, 70, 100, 30);
        f2.add(dob);
        
         db=new JDateChooser();
        db.setBounds(150,70,300,30);
        f2.add(db);
        
         numberplate=new JLabel("Number plate:");
        numberplate.setBounds(30, 110, 100, 30);
        f2.add(numberplate);
        
         np=new JTextField();
        np.setBounds(150,110,300,30);
        f2.add(np);
        
         address=new JLabel("Address:");
        address.setBounds(30, 150, 100, 30);
        f2.add(address);
        
         add=new JTextField();
        add.setBounds(150,150,300,30);
        f2.add(add);
        
         adh=new JLabel("Addhar No:");
        adh.setBounds(30, 190, 100, 30);
        f2.add(adh);
        
         ad=new JTextField();
        ad.setBounds(150,190,300,30);
        f2.add(ad);
        
         phone=new JLabel("Phone No:");
        phone.setBounds(30, 230, 100, 30);
        f2.add(phone);
        
         ph=new JTextField();
        ph.setBounds(150,230,300,30);
        f2.add(ph);
        
         model=new JLabel("Model Name:");
        model.setBounds(30, 270, 100, 30);
        f2.add(model);
        
         md=new JTextField();
        md.setBounds(150,270,300,30);
        f2.add(md);
        
         res=new JLabel("Resistration Date:");
        res.setBounds(30, 310, 130, 30);
        f2.add(res);
        
         rs=new JDateChooser();
        rs.setBounds(150,310,300,30);
        f2.add(rs);
        
         center=new JLabel("Center:");
        center.setBounds(30, 350, 100, 30);
        f2.add(center);
        
         ct=new JTextField();
        ct.setBounds(150,350,300,30);
        f2.add(ct);
        
         cno=new JLabel("Center No:");
        cno.setBounds(30, 390, 100, 30);
        f2.add(cno);
        
         cn=new JTextField();
        cn.setBounds(150,390,300,30);
        f2.add(cn);
        
         b3= new JButton("submit");
        b3.setBounds(350,430,100,30);
        b3.addActionListener(this);
        f2.add(b3);
        
        
        
        
        
        f2.setVisible(true);
        
    }
    @Override 
    public void actionPerformed(ActionEvent ae) {
        String name3=name1.getText();
        String date=((JTextField)db.getDateEditor().getUiComponent()).getText();
        String no=np.getText();
       String addd=add.getText();
       String ah=ad.getText();
       String m=md.getText();
       String r=((JTextField)rs.getDateEditor().getUiComponent()).getText();
       String p=ph.getText();
       String cs=ct.getText();
         String n=cn.getText();
         String a1="^[0-9]$";
         String a="^[2-9]{1}[0-9]{3}[0-9]{4}[0-9]{4}$";
         Pattern pp=Pattern.compile(a);
         Matcher mm=pp.matcher(ah);
          Pattern p1=Pattern.compile(a1);
         Matcher m1=p1.matcher(name3);
         String a2="^[789]{1}[0-9]{9}";
         Pattern p2=Pattern.compile(a2);
         Matcher m2=p2.matcher(p);
         try{
         if(name3.equals("")){
             JOptionPane.showMessageDialog(null,"Name is Required");
         }else if(m1.matches()){
             JOptionPane.showMessageDialog(null,"Please enter your name");
         }else if(date.equals("")){
             JOptionPane.showMessageDialog(null,"DOB is Required");
         }else if(no.equals("")){
             JOptionPane.showMessageDialog(null,"noplate is Required");
         }else if(addd.equals("")){
             JOptionPane.showMessageDialog(null,"addres is Required");
         }else if(ah.equals("")){
             JOptionPane.showMessageDialog(null,"addhar is Required");
         } else if(!mm.matches()){
           JOptionPane.showMessageDialog(null,"Enter valid addhar no");  
         }else  if(p.equals("")){
             JOptionPane.showMessageDialog(null,"Phone No is Required");
         }else if(!m2.matches()){
             JOptionPane.showMessageDialog(null,"Please enter valid phone no");
         }else if(m.equals("")){
             JOptionPane.showMessageDialog(null,"Model Name is Required");
         }else if(r.equals("")){
             JOptionPane.showMessageDialog(null,"Resistration Date is Required");
         }else if(cs.equals("")){
             JOptionPane.showMessageDialog(null,"Center Name  is Required");
         }else if(n.equals("")){
             JOptionPane.showMessageDialog(null,"center no is Required");
         }else if(!m2.matches()){
             JOptionPane.showMessageDialog(null,"Please enter valid phone no");
         }else {
             Conn c=new Conn();
             String sql="insert into vehicle values('"+no+"','"+name3+"','"+addd+"','"+date+"','"+p+"','"+ah+"','"+r+"','"+m+"','"+cs+"','"+n+"')";
             c.s.executeUpdate(sql);
             f2.setVisible(false);
            
             
             
         }
         }catch(Exception e){
             System.out.println(e);
             
         }
        
    
    }
    public static void main(String s[]){                            
        new signup(" ");
    }
}
