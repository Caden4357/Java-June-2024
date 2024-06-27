package ordersAndItems;

import java.util.ArrayList;

public class Order {
	private String name;
	private double total;
	private boolean isReady;
	private ArrayList<Item> items = new ArrayList<Item>(); // []
	
	
	public Order() {
		this.name = "Guest";
	}


	public Order(String name) {
		this.name = name;
	}

	public String getStatusMessage() {
		
		// expression ? return value : return value
		return isReady ? "Your order is ready!": "Thank you for waiting. Your order will be ready soon.";
//		if(isReady) {
//			return "Your order is ready.";
//		}else {
//			return "Thank you for waiting. Your order will be ready soon.";
//		}
	}
	
	public double getOrderTotal() {
		double total = 0.0;
		for(int idx = 0; idx < items.size(); idx++) {
			total += items.get(idx).getPrice();
		}
		return total;
	}
	
	public void display() {
		System.out.println("Customer Name: " + name);
		double total = 0.0;
		for(int idx = 0; idx < items.size(); idx++) {
			total += items.get(idx).getPrice();
			System.out.println(items.get(idx).getName() + " - $" + items.get(idx).getPrice());
		}
		System.out.println("Total: $" + total);
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public boolean isReady() {
		return isReady;
	}


	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}


	public ArrayList<Item> getItems() {
		return items;
	}


	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	
	
	
	
	
}
