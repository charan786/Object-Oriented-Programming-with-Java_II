
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container first = new Container();
        Container second = new Container();
        
        while(true){
            System.out.println("First: "+first);
            System.out.println("Second: "+second);
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String [] pieces = input.split(" ");
            
            String function = pieces[0];
            int quant = Integer.valueOf(pieces[1]);
            
            if(function.equals("add")){
                first.add(quant);
            }
            if(function.equals("move")){
                
                if ( quant> first.contains()) {
                    quant = first.contains();
                }
 
                first.remove(quant);
                second.add(quant);
            }
            if(function.equals("remove")){
                second.remove(quant);
            }
        }
        
    
        
      

        
    }

}
