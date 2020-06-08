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
public class BoxWithMaxWeight extends Box{
    
    
    private int max;
    private ArrayList<Item> list;
    
    public BoxWithMaxWeight(int capacity){
        max=capacity;
        list= new ArrayList<>();
    }
    @Override
    public void add(Item item){
        if(list.isEmpty()){
            if(item.getWeight()<max){
                list.add(item);
            }
        }else if(list.size()>=1){
            
            int sum=0;
            for(Item each:list){
                sum+=each.getWeight();
            }
            if(sum+item.getWeight()<=max){
                list.add(item);
            }
        
        }
        
        
    }
    
      
    
    @Override
    public boolean isInBox(Item item){
        if(list.contains(item)){
            return true;
        }
        return false;
    }
    public void printAll(){
        for(Item each:list){
            System.out.println(each.getName());
        }
    }
    
    
}
