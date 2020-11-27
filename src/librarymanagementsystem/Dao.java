/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;
import java.sql.*;
/**
 *
 * @author vinee
 */
public class Dao {
     static String URL="jdbc:mysql://localhost/library_system";
    static String uname="root";
    static String pass="";
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL,uname,pass);
        return con;
    }
}
