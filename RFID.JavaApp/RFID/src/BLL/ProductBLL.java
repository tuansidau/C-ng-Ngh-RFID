/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.ProductDAL;
import DAL.RegisterDAL;
import DTO.ProductDTO;
import DTO.RegisterDTO;
import java.util.ArrayList;

/**
 *
 * @author hoang
 */
public class ProductBLL {
    public static ArrayList<ProductDTO> sumArr; 
    public ProductDTO productDTO;
    ProductDAL dal = new ProductDAL();
        
    public ProductBLL()
    {
        sumArr = new ArrayList<ProductDTO>();
    }
    
    public void docProduct()
    {
        sumArr = dal.docProduct();
    }
    
}
