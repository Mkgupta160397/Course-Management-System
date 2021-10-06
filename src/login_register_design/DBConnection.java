
package login_register_design;

import java.sql.*;

public class DBConnection {
     
    static final String DB_URL="jdbc:mysql://localhost:3306/demo";
    static final String USER="root";
    static final String PASS="";
    public static Connection connectDB() {
        Connection conn;
        
        
    try{
         //Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(DB_URL,USER,PASS);
        return conn;
        
    }catch(SQLException ex)
    {
        System.out.println("There were error while connecting to db.");
        return null;
    }
    }

   
    
}
