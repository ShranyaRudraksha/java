/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclesystems;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;


    public Conn(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        c= DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle", "root", "shranya");
        s=c.createStatement();
        System.out.println("connected");
    }catch(Exception e){
        System.out.println(e);
    }
    }
    
}
