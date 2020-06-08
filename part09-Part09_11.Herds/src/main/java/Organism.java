/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class Organism implements Movable {
    private int dx;
    private int dy;
    
    public Organism(int x, int y){
        dx = x;
        dy = y;
    }
    
    public void move(int dx, int dy){
        this.dx += dx;
        this.dy += dy;
    }
    public String toString(){
        return "x: "+dx+"; "+"y: "+dy;
    }
}
