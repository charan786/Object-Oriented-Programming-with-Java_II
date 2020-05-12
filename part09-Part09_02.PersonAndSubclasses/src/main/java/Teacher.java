/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class Teacher extends Person{
    private int salary;
    
    public Teacher(String x, String y, int c){
        super(x,y);
        salary=c;
    }
    @Override
    public String toString() {
        return super.toString() +"\n  "+"salary "+salary+" euro/month";
    }
}
