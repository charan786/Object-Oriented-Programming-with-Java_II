/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class Item {
    private String pro;
    private int quant;
    private int price;
    
    public Item(String product, int qty, int unitPrice){
        pro=product;
        quant=qty;
        price=unitPrice;
    }
    public int price(){
        return quant*price;
    }
    public void increaseQuantity(){
        quant += 1;
    }
    public String toString(){
        return pro+": "+quant;
    }
   
    
}
