
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
public class MisplacingBox extends Box{
    private ArrayList<Item> list;
    
    public MisplacingBox(){
        list=new ArrayList<>();
    }
    @Override
    public void add(Item item){
        list.add(item);
    }
    @Override
    public boolean isInBox(Item item){
        return false;
    }
}
