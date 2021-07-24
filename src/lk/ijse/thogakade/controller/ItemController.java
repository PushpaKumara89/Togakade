
package lk.ijse.thogakade.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.thogakade.dbconnection.DBConnection;
import lk.ijse.thogakade.modal.Item;

public class ItemController {
    
    public ArrayList<String> getAllItemsOnlyCode() throws ClassNotFoundException, SQLException{
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT Code FROM Item");
        ResultSet rst = stm.executeQuery();
        ArrayList list=new ArrayList<>();
        while(rst.next()){
            list.add(rst.getString(1));
        }
        return list;
    }
    
    public Item getItem(String code) throws ClassNotFoundException, SQLException{
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Item WHERE code=?");
        stm.setObject(1, code);
        ResultSet rst = stm.executeQuery();
        while(rst.next()){
            return new Item(rst.getString("code"),rst.getString(2),rst.getDouble(3),rst.getInt(4));
        }
        return null;
    }
    public static boolean addNewItem(Item item) throws ClassNotFoundException, SQLException{
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO Item VALUES(?,?,?,?)");
        stm.setObject(1, item.getCode());
        stm.setObject(2, item.getDescription());
        stm.setObject(3, item.getUnitPrice());
        stm.setObject(4, item.getQtyOnHand());
        return stm.executeUpdate()>0;
    }
    public static Item searchItem(String code) throws ClassNotFoundException, SQLException{
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM Item WHERE code='"+code+"'");
        if(rst.next()){
            return new Item(rst.getString("code"),rst.getString("description"),rst.getDouble("unitPrice"),rst.getInt("qtyOnHand"));
        }
        return null;
    }
    public static boolean deleteItem(String code) throws ClassNotFoundException, SQLException{
        return DBConnection.getInstance().getConnection().createStatement().executeUpdate("DELETE From Item WHERE code='"+code+"'")>0;
    }
    public static boolean updateItem(Item item) throws ClassNotFoundException, SQLException{
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("UPDATE Item SET description=?,unitPrice=?,qtyOnHand=? WHERE code=?");
        stm.setObject(1, item.getDescription());
        stm.setObject(2, item.getUnitPrice());
        stm.setObject(3, item.getQtyOnHand());
        stm.setObject(4, item.getCode());
        return stm.executeUpdate()>0;
    }
    public static ArrayList<Item> getAllItems() throws ClassNotFoundException, SQLException{
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM Item");
        ArrayList<Item> itemList=new ArrayList<>();
        while(rst.next()){
            itemList.add(new Item(rst.getString("code"),rst.getString("description"),rst.getDouble("unitPrice"),rst.getInt("qtyOnHand")));
        }
        return itemList;
    }
    public static ArrayList<Item> getAllItems(String front) throws ClassNotFoundException, SQLException{
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM Item WHERE description LIKE '%"+front+"%'");
        ArrayList<Item> itemList=new ArrayList<>();
        while(rst.next()){
            itemList.add(new Item(rst.getString("code"),rst.getString("description"),rst.getDouble("unitPrice"),rst.getInt("qtyOnHand")));
        }
        return itemList;
    }
}
