package ordersAndItems;

public class TestOrders {
	
	public static void main(String[] args) {
		Item item1 = new Item("Mocha", 4.50 );
		Item item2 = new Item("Latte", 5.50);
		Item item3 = new Item("Bagel", 3.50);
		
		Order order1 = new Order("Cindhuri");
		Order order2 = new Order("Jimmy");
		Order order3 = new Order();
		order1.addItem(item2);
		order1.addItem(item1);
		
		order2.addItem(item2);
		order2.addItem(item3);
		System.out.println(order1.getItems().get(0).getName());
		System.out.println(order1.getStatusMessage());
		
		double order1Total = order1.getOrderTotal();
		System.out.println("Your total is: $" + order1Total);
		order1.display();
		order2.display();
		System.out.println(order3.getName());
		
//		System.out.println(order2.items.get(0).name);
		
//		order1.total += item1.price;
//		order1.total += item2.price;
	}
}
