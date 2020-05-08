
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));
        hashmap.put("happy", new Book("Don't let the pigeon drive the bus", 2003, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "ide");
        
    }
    public static void printValues(HashMap<String,Book> hashmap){
        for(Book eachObject:hashmap.values()){
            System.out.println(eachObject);
        }
    }
    
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for(Book eachValue:hashmap.values()){
            String name= eachValue.getName();
            if(name.contains(text)){
                System.out.println(eachValue);
            }
        }
    }

}
