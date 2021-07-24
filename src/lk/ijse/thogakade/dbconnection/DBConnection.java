
package lk.ijse.thogakade.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection bConnection;
    private Connection connection;
    
    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost: 3307/ThogaKade", "root", "1234");
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        if(bConnection!=null){
            return bConnection;
        }
        return bConnection=new DBConnection();
    }
    
}
