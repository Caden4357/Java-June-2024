package battleRoyal;

public class TestPlayers {
	public static void main(String[] args) {
		Human joe = new Human("Joe");
		Warrior conan = new Warrior("Conan");
		Warrior doomGuy = new Warrior("Doom Guy");
		Sword longSword = new Sword("Longsword", "Sword", 15);
		Weapon chainsaw = new Weapon("Chainsaw", "chainsaw", 40);
		doomGuy.setEquipedWeapon(chainsaw);
		conan.setEquipedWeapon(longSword);
		System.out.println("Conan has the " + conan.getEquipedWeapon().getName() + " Equipped");
		conan.getLevel();
//		System.out.println(joe.getHealth());
		joe.attack(conan);
		conan.attack(doomGuy);
		doomGuy.attack(conan);
//		System.out.println("Joes Stamina: " + joe.getStamina());
//		System.out.println("Conans Health: " + conan.getHealth());
//		System.out.println("Conans alive status: " + conan.isAlive());
//		System.out.println("Conans level: " + conan.getLevel());
	}
}
