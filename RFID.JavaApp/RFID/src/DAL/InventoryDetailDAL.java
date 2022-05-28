/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.InventoryDTO;
import DTO.InventoryDetail;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author hoang
 */
public class InventoryDetailDAL {
    MyDBConnection conn = new MyDBConnection();
    InventoryDetail inventorydetail;
    public ArrayList docInventory()
    {
        ArrayList list = new ArrayList<InventoryDTO>();
        try
        {
            String query = "Select * from inventorydetail";
            ResultSet rs = conn.executeQuery(query);
        while (rs.next())
            {
                inventorydetail = new InventoryDetail(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
                list.add(inventorydetail);
            }
        } catch(Exception e)
        {
            System.out.println("Lỗi đọc DAL");
        }
        return list;
    }
    public void insertInventorydetail(InventoryDetail object)
    {
        try
        {
        String query = "INSERT INTO `inventorydetail`"
                + "(`IdRegister`, `IdInventory`, `isReading`) VALUES ('"
                
                + object.getIdInventory()+ "','"
                + object.getIdRegister()+ "','"
                + object.getIsReading()
                + "')";
        conn.executeUpdate(query);
        } catch(Exception e)
        {
            System.out.println("Lỗi thêm DAL");
        }
    }
    public void UpdateInventoryDatail(InventoryDetail object)
    {
        try
        {
            String query = "UPDATE `inventory` SET "
                    + "`InventoryNo`= '" + object.getIdInventory()+"',"
                    + "`InventoryDate`= '" + object.getIdRegister()+"',"
                    + "`MoreInfo`= '" + object.getIsReading()
                    + "' WHERE Id = " + object.getId();
            conn.executeUpdate(query);
        } catch (Exception e)
        {
            System.out.println("Lỗi sữa DAL");
        }
    }
    public void suaTrangthai(int id, int trangthai)
    {
        try
        {
            String query = "UPDATE `inventorydetail` SET "
                    + "`isReading`= '" + trangthai +"'"                    
                    + " WHERE id = " + id;
            conn.executeUpdate(query);
        } catch (Exception e)
        {
            System.out.println("Lỗi sữa DAL");
        }
    }
}
