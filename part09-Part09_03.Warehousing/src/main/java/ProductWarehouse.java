import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class ProductWarehouse extends Warehouse{
    private String name;
    
    
    
    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        name =productName;
        
    }
    
    public String getName(){
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }
    @Override
    public String toString() {
        return name+": "+super.toString();
    }
    
}
