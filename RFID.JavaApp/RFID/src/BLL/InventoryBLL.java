/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.InventoryDAL;
import DAL.RegisterDAL;
import DTO.InventoryDTO;
import DTO.RegisterDTO;
import java.util.ArrayList;

/**
 *
 * @author hoang
 */
public class InventoryBLL {
    public static ArrayList<InventoryDTO> sumArr; 
    public InventoryDTO inventoryDTO;
    InventoryDAL dal = new InventoryDAL();
        
    public InventoryBLL()
    {
        sumArr = new ArrayList<InventoryDTO>();
    }
    
    public void docInventory()
    {
        sumArr = dal.docInventory();
    }
    
    public void insertInventory(InventoryDTO object)
    {
        sumArr.add(object);
        dal.insertInventory(object);        
    }
}
