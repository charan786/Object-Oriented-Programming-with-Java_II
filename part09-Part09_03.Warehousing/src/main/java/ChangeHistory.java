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
public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        history = new ArrayList<>();
    }
    public void add(double status){
        history.add(status);
    }
    
    public void clear(){
        history.clear();
    }
    public double maxValue(){
        if(history.isEmpty()){
            return 0;
        }
        double largest = history.get(0);
        for(int i=0;i<history.size();i++){
            double each = history.get(i);
            if(each>largest){
                largest =each;
            }
        }
        return largest;
        
    }
    public double minValue(){
        if(history.isEmpty()){
            return 0;
        }
        double min = history.get(0);
        for(int i=0;i<history.size();i++){
            double each = history.get(i);
            if(each<min){
                min =each;
            }
        }
        return min;
    }
    
    public double average(){
        if(history.isEmpty()){
            return 0;
        }
        double sum=0;
        int count =0;
        for(double x:history){
            sum += x;
            count+=1;
        }
        return sum/count;
        
    }
    public String toString(){
        return Arrays.toString(history.toArray());
    }
}
