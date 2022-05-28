/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.InventoryDAL;
import DAL.InventoryDetailDAL;
import DTO.InventoryDTO;
import DTO.InventoryDetail;
import java.util.ArrayList;

/**
 *
 * @author hoang
 */
public class InventoryDetailBLL {
    public static ArrayList<InventoryDetail> sumArr; 
    public InventoryDetail inventorydetail;
    InventoryDetailDAL dal = new InventoryDetailDAL();
        
    public InventoryDetailBLL()
    {
        sumArr = new ArrayList<InventoryDetail>();
    }
    
    public void docInventory()
    {
        sumArr = dal.docInventory();
    }
    
    public void insertInventoryDetail(InventoryDetail object)
    {
        sumArr.add(object);
        dal.insertInventorydetail(object);        
    }
    public void suaTrangthai(int id, int trangthai)
    {
        dal.suaTrangthai(id, trangthai);
        for(InventoryDetail a : sumArr)
        {
            if(a.getId()== id)
            {
                a.setIsReading(trangthai);
                break;
            }
        }
    }
}
