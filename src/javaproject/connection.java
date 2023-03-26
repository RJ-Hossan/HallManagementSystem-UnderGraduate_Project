package javaproject;

import java.sql.*;
//import com.mysql.jdbc.Driver;
import com.mysql.cj.jdbc.Driver;

public class connection {
    public static Connection connect() throws SQLException{
        Connection con = null;
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Driver.class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms", "refaj", "1234");
            
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            System.out.println("not connected");
        }
        return con;
    }

    static com.sun.jdi.connect.spi.Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
