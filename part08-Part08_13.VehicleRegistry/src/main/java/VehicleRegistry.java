import java.util.HashMap;
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
public class VehicleRegistry {
    private HashMap<LicensePlate, String> x;
    
    
    public VehicleRegistry(){
        x = new HashMap<>();
        
    }
    public boolean add(LicensePlate licensePlate, String owner){
        if(x.containsKey(licensePlate)){
                return false;
            
        }
        x.put(licensePlate,owner);
        
        return true;
        
    }
    public String get(LicensePlate licensePlate){
        if(!(x.containsKey(licensePlate))){
            return null;
        }
        return x.get(licensePlate);
        
    }
    public boolean remove(LicensePlate licensePlate){
        if((x.containsKey(licensePlate))){
            x.remove(licensePlate);
            return true;
        }
        return false;
    }
    public void printLicensePlates(){
        for (LicensePlate key : x.keySet()) {
            System.out.println(key);
        }
    }
    
    public void printOwners(){
        
        ArrayList<String> y = new ArrayList<>();
        for (String eachValue : x.values()) {
            if(!(y.contains(eachValue))){
                y.add(eachValue);
            }
        }
        for(String x:y){
            System.out.println(x);
        }
    }
    
} 
