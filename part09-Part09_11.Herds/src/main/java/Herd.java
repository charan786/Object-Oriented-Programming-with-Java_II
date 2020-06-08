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
public class Herd implements Movable{
    private List<Movable> all;
    
    public Herd(){
        all = new ArrayList<>();
    }
    public void addToHerd(Movable movable){
        all.add(movable);
    }
    public void move(int dx, int dy){
        for(Movable each:all){
            each.move(dx,dy);
        }
    }
    public String toString(){
        String x = "";
        for(Movable each:all){
            x = x+each+"\n";
        }
        return x;
    }
}
