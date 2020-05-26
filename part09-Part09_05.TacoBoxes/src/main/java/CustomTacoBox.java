/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class CustomTacoBox implements TacoBox{
    private int intial;
    public CustomTacoBox(int x){
        intial =x;
    }
    @Override
    public int tacosRemaining(){
        if(intial <=0){
            return 0;
        }
        return intial;
    }
    @Override
    public void eat(){
        intial -=1;
    }
}
