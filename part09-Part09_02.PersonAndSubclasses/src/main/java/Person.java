/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class Person {
    private String name;
    private String add;
    
    public Person(String x, String y){
        name =x;
        add =y;
    }
    public String toString(){
        return name+"\n"+"  "+add;
    }
    
}
