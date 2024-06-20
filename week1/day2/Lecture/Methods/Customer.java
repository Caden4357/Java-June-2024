
public class Customer {
    
    public void greet(){
        System.out.println("Hello World!");
    }

    // method overloading - same method name, different parameters
    public void greet(String name){
        System.out.println("Hello " + name);
    }
    public String greet(String name, int age){
        System.out.println("Hello");
        return "";
    }
}
