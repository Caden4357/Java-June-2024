package battleRoyal;

public class Human {
	private double health = 100;
	private double stamina = 100;
	private int level;
	private String name;
	private boolean isAlive;
	
	
	public Human(String name) {
		this.level = 1;
		this.name = name;
	}

	

	public Human( String name, int level) {
		this.level = level;
		this.name = name;
	}

	public void attack(Human target) {
		this.setStamina(this.getStamina() - 10);
		target.setHealth(target.getHealth() - 5);
	}

	public double getHealth() {
		return health;
	}


	public void setHealth(double health) {
		if(health > 100) {
			this.health = 100;
		}else if(health <= 0) {
			System.out.println("You're dead");
			this.isAlive = false;
			this.health = 0;
		}else {
			this.health = health;	
		}
	}


	public double getStamina() {
		return stamina;
	}


	public void setStamina(double stamina) {
		if(stamina > 100) {
			this.stamina = 100;
		}else if(stamina <= 0) {
			System.out.println("You're to tired to perform that action");
			this.stamina = 0;
		}else {
			this.stamina = stamina;	
		}
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isAlive() {
		return isAlive;
	}


	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	
	
	

}
