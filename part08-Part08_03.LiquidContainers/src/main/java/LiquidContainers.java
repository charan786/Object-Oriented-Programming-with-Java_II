
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        String hansolo = "/100";
        


        while (true) {
            System.out.println("First: "+first+hansolo);
            System.out.println("Second: "+second+hansolo);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String [] pieces = input.split(" ");
            
            String function = pieces[0];
            int quant = Integer.valueOf(pieces[1]);
            
            if(function.equals("add")){
                if(quant>0){
                    first=first+quant;
                }
                System.out.println(first);
                int max =100;
                if(first>100){
                    first = max;
                }
            }else if(function.equals("move")){
                if(first>=quant){
                    first = first-quant;
                    second = second+quant;
                }else if(first<quant){
                    second += first;
                    first =0;
                    
                }
                if(first<0){
                    first =0;
                }
                int max=100;
                if(second>max){
                    second = max;
                }
            }else if(function.equals("remove")){
                second = second - quant;
                if(second <0){
                    second =0;
                }
            }

        }
    }

}
