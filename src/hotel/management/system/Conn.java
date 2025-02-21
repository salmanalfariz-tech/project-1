
package hotel.management.system;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    Conn(){
        try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       c=DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem","root","nikunjam@2");
       s=c.createStatement();
        }
    catch(Exception c){
    c.printStackTrace();
}
}
 }