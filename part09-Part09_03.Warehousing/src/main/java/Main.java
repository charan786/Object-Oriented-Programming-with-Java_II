

public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("coffee", 10, 5);
        juice.takeFromWarehouse(7);
        
//System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        juice.printAnalysis();
  
    }

}
