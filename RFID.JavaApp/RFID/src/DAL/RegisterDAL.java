/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.InventoryDTO;
import DTO.RegisterDTO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author hoang
 */
public class RegisterDAL {
    MyDBConnection conn = new MyDBConnection();
    RegisterDTO register;
    public ArrayList docRegister()
    {
        ArrayList list = new ArrayList<InventoryDTO>();
        try
        {
            String query = "Select * from register";
            ResultSet rs = conn.executeQuery(query);
        while (rs.next())
            {
                register = new RegisterDTO(rs.getInt(1), rs.getString(2), rs.getInt(3));
                list.add(register);
            }
        } catch(Exception e)
        {
            System.out.println("Lỗi đọc DAL");
        }
        return list;
    }
    public void insertRegister(RegisterDTO object)
    {
        try
        {
        String query = "INSERT INTO `register`"
                + "(`TagId`, `IdProduct`) VALUES ('"
                
                + object.getTagId()+ "','"
                + object.getIdProduct()
                + "')";
        conn.executeUpdate(query);
        } catch(Exception e)
        {
            System.out.println("Lỗi thêm DAL");
        }
    }
    public void UpdateRegister(RegisterDTO object)
    {
        try
        {
            String query = "UPDATE `register` SET "
                    + "`TagId`= '" + object.getTagId()+"',"
                    + "`IdProduct`= '" + object.getIdProduct()
                    + "' WHERE Id = " + object.getId();
            conn.executeUpdate(query);
        } catch (Exception e)
        {
            System.out.println("Lỗi sữa DAL");
        }
    }
}
