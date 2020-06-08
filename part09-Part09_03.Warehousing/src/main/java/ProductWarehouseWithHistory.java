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
public class ProductWarehouseWithHistory extends ProductWarehouse{
    
    private ChangeHistory x;
    
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName,capacity);// Using B 
        x = new ChangeHistory();
        addToWarehouse(initialBalance);
    }
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        x.add(getBalance());
    } 
    
    @Override
    public double takeFromWarehouse(double amount){
        
        double y =super.takeFromWarehouse(amount);
        x.add(getBalance());
        return y;
        
        
        
        
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+getName());
        System.out.println("History: "+x.toString());
        System.out.println("Largest amount of product: "+x.maxValue());
        System.out.println("Smallest amount of product: "+x.minValue());
        System.out.println("Average: "+x.average());
        
    }
    
    
    
    
    
    public String history(){
        return x.toString();  
    }
}
