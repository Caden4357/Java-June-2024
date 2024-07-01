package battleRoyal;

import java.util.ArrayList;

public interface Equippable {
	abstract void equip(Human character);
	abstract void unequip(Human character);
	
	abstract ArrayList<String> reportEquipmentHistory();
}
