/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author hoang
 */
public class InventoryDTO {
    private int Id;
    private String InventoryNo, InventoryDateString, MoreInfo;

    public InventoryDTO(int Id, String InventoryNo, String InventoryDateString, String MoreInfo) {
        this.Id=Id;
        this.InventoryNo = InventoryNo;
        this.InventoryDateString = InventoryDateString;
        this.MoreInfo = MoreInfo;
    }

    public InventoryDTO(String InventoryNo, String InventoryDateString, String MoreInfo) {
        this.InventoryNo = InventoryNo;
        this.InventoryDateString = InventoryDateString;
        this.MoreInfo = MoreInfo;
    }

    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getInventoryNo() {
        return InventoryNo;
    }

    public void setInventoryNo(String InventoryNo) {
        this.InventoryNo = InventoryNo;
    }

    public String getInventoryDateString() {
        return InventoryDateString;
    }

    public void setInventoryDateString(String InventoryDateString) {
        this.InventoryDateString = InventoryDateString;
    }

    public String getMoreInfo() {
        return MoreInfo;
    }

    public void setMoreInfo(String MoreInfo) {
        this.MoreInfo = MoreInfo;
    }
    
    
    
}
