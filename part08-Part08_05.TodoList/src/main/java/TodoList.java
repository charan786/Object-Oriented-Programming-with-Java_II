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
public class TodoList {
    private ArrayList<String> lust;
    
    public TodoList(){
        lust = new ArrayList<>();
    }
    
    public void add(String task){
        lust.add(task);
    }
    public void print(){
        for(int i=1;i<=lust.size();i++){
            System.out.println(i+": "+lust.get(i-1));
        }
    }
    public void remove(int number){
        lust.remove(number-1);
    }
}

