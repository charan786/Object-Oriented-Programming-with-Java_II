
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String hello = scanner.nextLine();
            if(hello.equals("end")){
                break;
            }else{
                int x = Integer.valueOf(hello);
                System.out.println(x*x*x);
            }
        }

    }
}
