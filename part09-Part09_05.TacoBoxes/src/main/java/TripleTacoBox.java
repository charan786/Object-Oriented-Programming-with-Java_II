/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class TripleTacoBox implements TacoBox {
    private int taco;
    
    public TripleTacoBox(){
        taco=3;
    }
    @Override
    public int tacosRemaining(){
        if(taco <=0){
            return 0;
        }
        return taco;
    }
    @Override
    public void eat(){
        taco -=1;
    }
}
