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
public class Box implements Packable{
    private double max;
    private ArrayList<Packable> list;
    
    
    //ArrayList<Readable> readingList = new ArrayList<>();

    public Box(double x){
        max =x;
        list=new ArrayList<>();
    }
    
    public void add(Packable x){
        if(list.isEmpty()){
            if(x.weight()<max){
                list.add(x);
            }
        }else if(x.weight()+weight()<=max){
            list.add(x);
        }
        
    }
    public double weight(){
        double sum=0;
        
        for(Packable each:list){
            sum += each.weight();
        }
        return sum;
    }
    
    public String toString(){
        return "Box"+": "+list.size()+" items, "+"total weight "+weight()+" kg";
    }
    
}
