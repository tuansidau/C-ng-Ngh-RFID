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
public class RegisterDTO {

    private String TagId;
    private int id, idProduct;

    public RegisterDTO(int id,String TagId, int idProduct) {
        this.id=id;
        this.TagId = TagId;
        this.idProduct = idProduct;
    }

    public RegisterDTO(String TagId, int idProduct) {
        this.TagId = TagId;
        this.idProduct = idProduct;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTagId() {
        return TagId;
    }

    public void setTagId(String TagId) {
        this.TagId = TagId;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }


    
}
