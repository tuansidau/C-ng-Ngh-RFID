/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.RegisterDAL;
import DTO.RegisterDTO;
import java.util.ArrayList;

/**
 *
 * @author hoang
 */
public class RegisterBLL {
    public static ArrayList<RegisterDTO> sumArr; 
    public RegisterDTO registerDTO;
    RegisterDAL dal = new RegisterDAL();
        
    public RegisterBLL()
    {
        sumArr = new ArrayList<RegisterDTO>();
    }
    
    public void docRegister()
    {
        sumArr = dal.docRegister();
    }
    
    public void insertRegister(RegisterDTO object)
    {
        sumArr.add(object);
        dal.insertRegister(object);        
    }
    
    public void updateRegister(RegisterDTO object)
    {
        dal.UpdateRegister(object);
        for(RegisterDTO a : sumArr)
        {
            if(a.getId() == object.getId())
            {
                a.setTagId(object.getTagId());
                a.setIdProduct(object.getIdProduct());
                
                break;
            }
        }
    }
}
