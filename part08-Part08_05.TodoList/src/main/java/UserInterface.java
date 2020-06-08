import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class UserInterface {
    private TodoList replica;
    private Scanner read;
    
    public UserInterface(TodoList luck,Scanner run){
        replica = luck;
        read = run; 
    }
    public void start(){
        while(true){
            System.out.print("Command: ");
            String input = read.nextLine();
            if(input.equals("stop")){
                break;
            }
            processInput(input);
            
        }
    }
    public void processInput(String really){
        if(really.equals("add")){
            add();
        }else if(really.equals("list")){
            listAll();
        }else if(really.equals("remove")){
            del();
        }
    }
    public void add(){
        System.out.print("To add: ");
        String each = read.nextLine();
        replica.add(each);
    }
    
    public void listAll(){
        replica.print();
    }
    public void del(){
        System.out.println("Which one is removed?");
        int num =Integer.valueOf(read.nextLine());
        replica.remove(num);
        
    }
    
}
