package battleRoyal;

public class Warrior extends Human implements Actionable {
	private Weapon equipedWeapon;
	
	public Warrior(String name) {
		super(name, 10);
	}

	public Weapon getEquipedWeapon() {
		return equipedWeapon;
	}

	public void setEquipedWeapon(Weapon equipedWeapon) {
		this.equipedWeapon = equipedWeapon;
	}
	
	@Override
	public void attack(Human target) {
		// use weapons attack power along with players level to determine total attack power then set stamina and health 
		int attackPower = (this.getEquipedWeapon().getAttackPower() + this.getLevel());
		System.out.println(attackPower);
		this.setStamina(this.getStamina() - 10);
		target.setHealth(target.getHealth() - attackPower);
		System.out.println(this.getName() + " Attacked " + target.getName() + " for " + attackPower + " Damage " + this.getName() +  "'s stamina is now " + this.getStamina() + " and " + target.getName() + "'s health is now " + target.getHealth());
	}
	
	@Override
	public void defend() {
		this.setStamina(this.getStamina() - 5);
	}

	@Override
	public void move() {
		this.setStamina(this.getStamina() - 2);
	}
	
	
}
