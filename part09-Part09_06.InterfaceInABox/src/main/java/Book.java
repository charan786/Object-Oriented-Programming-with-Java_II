/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class Book implements Packable{
    private String author;
    private String bookname;
    private double weight;
    
    public Book(String x, String y, double z){
        author=x;
        bookname=y;
        weight=z;
    }
    public String getAuth(){
        return author;
    }
    @Override
    public double weight(){
        return weight;
    }
    
    public String getbook(){
        return bookname;
    }
    public String toString(){
        return getAuth()+": "+getbook(); 
    }
}
