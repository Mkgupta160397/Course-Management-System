package login_register_design;

import java.sql.*;

public class conn{
    
    public Connection c;
    public Statement s;
 
    public  conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/project3","root","");
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
 
