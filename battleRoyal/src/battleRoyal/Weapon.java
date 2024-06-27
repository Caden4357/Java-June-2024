package battleRoyal;

public class Weapon {
	private String name;
	private String type;
	private int attackPower;
	
	
	public Weapon(String name, String type, int attackPower) {
		this.name = name;
		this.type = type;
		this.attackPower = attackPower;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getAttackPower() {
		return attackPower;
	}


	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	
}
