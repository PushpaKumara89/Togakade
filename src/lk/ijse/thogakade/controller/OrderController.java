
package lk.ijse.thogakade.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.thogakade.dbconnection.DBConnection;

public class OrderController {

    public static String getOrderID() throws ClassNotFoundException, SQLException {
        ResultSet rst = DBConnection.getInstance().getConnection().prepareStatement("SELECT id FROM Orders ORDER BY id DESC LIMIT 1").executeQuery();
        if(rst.next()){
            String orderID=rst.getString(1);
            orderID=orderID.split("[A-Z]")[1]+"";
            return "D"+orderID;
        }else{
            return "D001";
        }
    }
}
