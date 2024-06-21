import java.util.ArrayList;

public class Customer {
    
    public void greet(){
        System.out.println("Hello World!");
    }

    // method overloading - same method name, different parameters
    public void greet(String name){
        System.out.println("Hello " + name);
    }
    public String greet(String name, String location){
        return "Hello " + name + " Welcome to our " + location + " Location" ;
    }

    public String placeOrder(String name, String food, Double price){
        return name + " I got " + food + " Your total will be: $" + price;
    }


    // loop through the menu and print out the item and its price 
    public void displayMenuItems(ArrayList<String> menu, ArrayList<Double> prices){
        if(menu.size() != prices.size()){
            System.out.println("Cannot Validate different sizes");
        }else{
            for(int idx = 0; idx < menu.size(); idx++){
                System.out.println(menu.get(idx) + " - $" + prices.get(idx));
            }
        }
    }

    public void calculateTotal(ArrayList<Double> prices){
        // var to hold the total
        Double total = 0.0;
        // for loop to go through the list 
        for(int idx = 0; idx < prices.size(); idx++){
            // add each price to the total
            total += prices.get(idx);
        }
        System.out.println(total);
    }

    // prompt the customer for their name (input in the terminal)
    // add that name to the customerNames arrayList
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Welcome to McFancy's please enter name: ");
        String username = System.console().readLine();
        System.out.println("Thanks for coming in " + username);
        customers.add(username);
        System.out.println(customers);
    }

}
