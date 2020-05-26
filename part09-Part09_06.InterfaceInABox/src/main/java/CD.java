/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class CD implements Packable{
    private String artist;
    private String cdName;
    private int publication;
    private double weight;
    
    public CD(String x, String y, int z){
        artist=x;
        cdName=y;
        publication=z;
        weight= 0.1;
    }
    public String getAr(){
        return artist;
    }
    public String getcd(){
        return cdName;
    }
    public int getPub(){
        return publication;
    }
    @Override
    public double weight(){
        return weight;
    }
    
    public String toString(){
        return getAr()+": "+getcd()+" ("+getPub()+")";
    }
    
    
}
