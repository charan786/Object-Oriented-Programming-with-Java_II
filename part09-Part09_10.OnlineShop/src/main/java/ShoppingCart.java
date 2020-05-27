import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class ShoppingCart {
    private Map<String, Item> cart;
    
    
    public ShoppingCart(){
        cart= new HashMap<>();
        
    }
    
    public void add(String product, int price){
        if(!(cart.containsKey(product))){
            Item eachItem = new Item(product,1,price);
            cart.put(product,eachItem);
        }else{
            Item x = cart.get(product);
            x.increaseQuantity();
        }
        
        
        
    }
    
    
    public int price(){
        int total=0;
        for(Item each:cart.values()){
           int x = each.price();
            total +=x;
        }
        return total;
    }
    public void print(){
        for(Item each:cart.values()){
            System.out.println(each.toString());
        }
    }
    
}
