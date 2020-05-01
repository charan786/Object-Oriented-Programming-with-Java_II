
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0;
        double sum =0;
        while(true){
            int x = Integer.valueOf(scanner.nextLine());
            if(x ==0){
                break;
            }
            if(x>0){
                count += 1;
                sum += x;
            }
        }
        if(sum == 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(sum/count);
        }

    }
}
