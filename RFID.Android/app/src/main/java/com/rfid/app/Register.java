package com.rfid.app;

public class Register {
    public int Id, IdProduct;
    public String TagId;
    public Register(int Id, String TagId, int IdProduct) {
        this.Id = Id;
        this.TagId = TagId;
        this.IdProduct = IdProduct;
    }
}
