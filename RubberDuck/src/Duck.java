
public class Duck {
//	attributes or memeber vars 
	private String name;
	private String color = "Yelow";
	private int energy = 80; // this is the max energy level for any duck
	private boolean isHelpful = true;
	
	// Constructors 
	public Duck() {
		
	}
	
	public Duck(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public boolean isHelpful() {
		return isHelpful;
	}
	public void setHelpful(boolean isHelpful) {
		this.isHelpful = isHelpful;
	}
	// Methods (Actions)
	public void quack() {
		System.out.println(this.getName() + " Quacks loudly");
		
		this.setHelpful(false);
	}
	
	//swim
	public void swim() {
		if((this.energy - 10) < 0) {
			System.out.println("Your too tired");
		}else {
			this.setEnergy(energy - 10);
		}
	}
	
	// rest 
	public void rest() {
		this.setEnergy(energy + 10);
	}
	
	// display 
	public void display() {
		   System.out.println("Duck Name: " + this.name);
	        System.out.println("Color: " + this.color);
	        System.out.println("Energy: " + this.energy);
	        System.out.println("Is Helpful? " + (this.energy > 10 ? "Yes" : "No"));
	        
	        // this is the ternary long way 
//	        if(this.isHelpful) {
//	        	System.out.println("Yes");
//	        }else {
//	        	System.out.println("No");
//	        }
	}
	
}
