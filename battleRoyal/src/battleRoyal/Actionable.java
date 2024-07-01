package battleRoyal;

public interface Actionable {
	abstract void attack(Human target);
	abstract void defend();
	abstract void move();
}
