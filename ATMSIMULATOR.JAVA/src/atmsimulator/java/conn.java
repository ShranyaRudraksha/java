
package atmsimulator.java;

import java.sql.*;


public class conn {
    Connection c;
    Statement s;

    public conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///atmme","root","Sumit@319");
            s = c.createStatement();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
