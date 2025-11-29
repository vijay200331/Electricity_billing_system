            
package electricity.billing.system;

import java.sql.*;


public class Conn {
   // Class.forName("com.mysql.cj.jdbc.Driver");
    Connection c;
    Statement s;
    Conn(){
        try{
         
           c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","123456");
           s = c.createStatement();
        }catch (Exception e ){
            e.printStackTrace();
        }
        }
        
}
