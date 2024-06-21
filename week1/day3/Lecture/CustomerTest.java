import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        ArrayList<String> customerNames = new ArrayList<String>();
        customerNames.add("Robert");
        customerNames.add("Jeff");
        customerNames.add("Sapphire");
        customerNames.add("Jacob");

        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("Mac Jack");
        menuItems.add("Cherry Slush");
        menuItems.add("Fries");
        menuItems.add("Salad");

        ArrayList<Double> prices = new ArrayList<Double>();
        prices.add(7.99);
        prices.add(3.99);
        prices.add(4.99);
        prices.add(6.99);


        ArrayList<Double> robertsOrder = new ArrayList<Double>();
        robertsOrder.add(6.99);
        robertsOrder.add(3.99);
        robertsOrder.add(4.99);
        
        customer.greet();
        customer.greet(customerNames.get(0));
        System.out.println(customer.greet(customerNames.get(0), "Burbank"));
        customer.displayMenuItems(menuItems, prices);
        System.out.println(customer.placeOrder(customerNames.get(0), menuItems.get(0), prices.get(0)));
        customer.placeOrder(customerNames.get(0), menuItems.get(0), prices.get(0));
        customer.calculateTotal(robertsOrder);

        customer.addCustomer(customerNames);
    }
}
