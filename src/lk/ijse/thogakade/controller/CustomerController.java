
package lk.ijse.thogakade.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.thogakade.dbconnection.DBConnection;
import lk.ijse.thogakade.modal.Customer;

public class CustomerController {
    public ArrayList<String> getAllCustomer() throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT id FROM Customer");
        ResultSet rst = stm.executeQuery();
        ArrayList<String>listCustId=new ArrayList<>();
        while(rst.next()){
            listCustId.add(rst.getString(1));
        }
        return listCustId;
    }
    public Customer getCustomer(String id) throws ClassNotFoundException, SQLException{
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Customer WHERE id=?");
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        while(rst.next()){
            return new Customer(rst.getString(1),rst.getString(2),rst.getString(3),rst.getDouble(4));
        }
        return null;
    }
    public boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException{
        
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("insert into Customer values(?,?,?,?)");
        stm.setObject(1, customer.getId());
        stm.setObject(2, customer.getName());
        stm.setObject(3, customer.getAddress());
        stm.setObject(4, customer.getSalary());
        int res = stm.executeUpdate();
      return res>0;  
    }
    
    
    public boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException{
        //return  DBConnection.getInstance().getConnection().createStatement().executeUpdate("Delete From Customer where id='" + id + "'")>0;
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Delete From Customer where id= ?");
        stm.setObject(1, id);
        return stm.executeUpdate()>0;
        
    }
    public boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException{
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Update Customer set name=?, address=?, salary=? where id=?");
        stm.setObject(1, customer.getName());
        stm.setObject(2, customer.getAddress());
        stm.setObject(3, customer.getSalary());
        stm.setObject(4, customer.getId());
        return stm.executeUpdate()>0;
    }
}
