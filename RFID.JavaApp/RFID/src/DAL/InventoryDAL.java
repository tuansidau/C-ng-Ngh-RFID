/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.InventoryDTO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author hoang
 */
public class InventoryDAL {
    MyDBConnection conn = new MyDBConnection();
    InventoryDTO inventory;
    public ArrayList docInventory()
    {
        ArrayList list = new ArrayList<InventoryDTO>();
        try
        {
            String query = "Select * from inventory";
            ResultSet rs = conn.executeQuery(query);
        while (rs.next())
            {
                inventory = new InventoryDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                list.add(inventory);
            }
        } catch(Exception e)
        {
            System.out.println("Lỗi đọc DAL");
        }
        return list;
    }
    public void insertInventory(InventoryDTO object)
    {
        try
        {
        String query = "INSERT INTO `inventory`"
                + "(`InventoryNo`, `InventoryDate`, `MoreInfo`) VALUES ('"
                
                + object.getInventoryNo()+ "','"
                + object.getInventoryDateString()+ "','"
                + object.getMoreInfo()
                + "')";
        conn.executeUpdate(query);
        } catch(Exception e)
        {
            System.out.println("Lỗi thêm DAL");
        }
    }
    public void UpdateInventory(InventoryDTO object)
    {
        try
        {
            String query = "UPDATE `inventory` SET "
                    + "`InventoryNo`= '" + object.getInventoryNo()+"',"
                    + "`InventoryDate`= '" + object.getInventoryDateString()+"',"
                    + "`MoreInfo`= '" + object.getMoreInfo()
                    + "' WHERE Id = " + object.getId();
            conn.executeUpdate(query);
        } catch (Exception e)
        {
            System.out.println("Lỗi sữa DAL");
        }
    }
}
