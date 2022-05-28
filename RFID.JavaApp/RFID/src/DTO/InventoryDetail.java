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
public class InventoryDetail {
   
private int Id, isReading, IdRegister, IdInventory;
    public InventoryDetail(int Id, int IdRegister, int IdInventory, int isReading) {
        this.Id=Id;
        this.IdRegister = IdRegister;
        this.IdInventory = IdInventory;
        this.isReading = isReading;
    }

    public InventoryDetail(int IdRegister, int IdInventory, int isReading) {
        this.IdRegister = IdRegister;
        this.IdInventory = IdInventory;
        this.isReading = isReading;
    }

    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdRegister() {
        return IdRegister;
    }

    public void setIdRegister(int IdRegister) {
        this.IdRegister = IdRegister;
    }

    public int getIdInventory() {
        return IdInventory;
    }

    public void setIdInventory(int IdInventory) {
        this.IdInventory = IdInventory;
    }

    public int getIsReading() {
        return isReading;
    }

    public void setIsReading(int isReading) {
        this.isReading = isReading;
    }
    
}
