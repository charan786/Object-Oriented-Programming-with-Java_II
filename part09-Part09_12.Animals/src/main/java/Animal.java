
public abstract class Animal {
    String c;
    public Animal( String name ) {
        c = name;
    }
    
    
    public void eat(){
        System.out.println(c+" eats");
    }
    public void sleep(){
        System.out.println(c+" sleeps");
    }
    public String getName(){
        return c;
    }
}
