/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class Student extends Person{
    private int credits;
    
    public Student(String x, String y) {
        super(x,y);
        credits=0;
    }
    public void study(){
        credits += 1;
         
    }
    public int credits(){
        return credits;
    }
    @Override
    public String toString() {
        return super.toString() + "\n  Study credits "+credits;
    }
}
