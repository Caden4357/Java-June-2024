package battleRoyal;

import java.util.ArrayList;

public class Weapon implements Equippable {
	private String name;
	private String type;
	private int attackPower;
	private ArrayList<String> equipmentHistory = new ArrayList<String>();
	
	public Weapon(String name, String type, int attackPower) {
		this.name = name;
		this.type = type;
		this.attackPower = attackPower;
	}


	@Override
	public void equip(Human character) {
		if(character instanceof Warrior) {
			((Warrior) character).setEquipedWeapon(this);
			this.equipmentHistory.add(character.getName() + " Equiped: " + this.getName());
		}
		
	}


	@Override
	public void unequip(Human character) {
		if(character instanceof Warrior && ((Warrior) character).getEquipedWeapon() == this) {
			this.equipmentHistory.add(character.getName() + " Unequiping: " + this.getName());
			((Warrior) character).setEquipedWeapon(null);
		}
		
	}


	@Override
	public ArrayList<String> reportEquipmentHistory() {
		return this.equipmentHistory;
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


	public ArrayList<String> getEquipmentHistory() {
		return equipmentHistory;
	}


	public void setEquipmentHistory(ArrayList<String> equipmentHistory) {
		this.equipmentHistory = equipmentHistory;
	}

	
	
}
