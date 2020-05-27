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
public class Warehouse {
    private Map<String, Integer> hell;
    private Map<String, Integer> bell;
    
    
    public Warehouse(){
        hell = new HashMap<>();
        bell = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        hell.put(product, price);
        bell.put(product, stock);
        
    }
    
    
    public int price(String product){
        if(hell.get(product) == null){
            return -99;
        }
       return hell.get(product);
    }
    
    
    public int stock(String product){
        if(bell.get(product) == null){
            return 0;
        }
       return bell.get(product);
        
    }
    public boolean take(String product) {
        if(bell.containsKey(product)){
            if(bell.get(product)>0){
                bell.put(product, bell.get(product) - 1);
                return true;
            }
           
           if((bell.put(product, bell.get(product) - 1)<=0)){
               bell.replace(product,0);
               return false;
           }
            
            
        }
        return false;
        
        
    }
    public Set<String> products(){
        Set<String> keys = hell.keySet();
        for (String product: keys) {
            System.out.println(product);
        }
        return keys;
    }
    
    
}
