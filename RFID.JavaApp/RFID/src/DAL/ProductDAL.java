/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.InventoryDTO;
import DTO.ProductDTO;
import DTO.RegisterDTO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author hoang
 */
public class ProductDAL {
    MyDBConnection conn = new MyDBConnection();
    ProductDTO product ;
    public ArrayList docProduct()
    {
        ArrayList list = new ArrayList<ProductDTO>();
        try
        {
            String query = "Select * from product";
            ResultSet rs = conn.executeQuery(query);
        while (rs.next())
            {
                product = new ProductDTO(rs.getInt(1), rs.getString(2), rs.getString(3));
                list.add(product);
            }
        } catch(Exception e)
        {
            System.out.println("Lỗi đọc DAL");
        }
        return list;
    }
    public void insertProduct(ProductDTO object)
    {
        try
        {
        String query = "INSERT INTO `product`"
                + "(`Code`, `DisplayName`) VALUES ('"
                
                + object.getCode()+ "','"
                + object.getDisplayName()
                + "')";
        conn.executeUpdate(query);
        } catch(Exception e)
        {
            System.out.println("Lỗi thêm DAL");
        }
    }
    public void UpdateProduct(ProductDTO object)
    {
        try
        {
            String query = "UPDATE `product` SET "
                    + "`TagId`= '" + object.getCode()+"',"
                    + "`IdProduct`= '" + object.getDisplayName()
                    + "' WHERE Id = " + object.getId();
            conn.executeUpdate(query);
        } catch (Exception e)
        {
            System.out.println("Lỗi sữa DAL");
        }
    }
}
