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
public class StorageFacility {
    private HashMap<String, ArrayList<String>> x;
    
    public StorageFacility(){
        x = new HashMap<>();
    }
    public void add(String unit, String item){
        x.putIfAbsent(unit, new ArrayList<>());
        x.get(unit).add(item);
    }
    public ArrayList<String> contents(String storageUnit){
        if(!(x.get(storageUnit) == null)){
            return x.get(storageUnit);
        }
        return new ArrayList<String>();
    }
    public void remove(String storageUnit, String item){
        x.get(storageUnit).remove(item);
        if(x.get(storageUnit).isEmpty()){
            x.remove(storageUnit);
        }
        
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> z = new ArrayList<>();
        for(String y:x.keySet()){
            if(!(x.get(y) == null)){
                z.add(y);
            }
        }
        return z;
    }
}
