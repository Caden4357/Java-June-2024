
public class TestDuck {
	public static void main(String[] args) {
		Duck robert = new Duck("Robert");
		Duck sally = new Duck("Sally");
		Duck howard = new Duck("Howard");
		System.out.println(robert.getName());
		System.out.println(robert.isHelpful());
		robert.quack();
		howard.quack();
		robert.rest();
		System.out.println(robert.getEnergy());
		robert.display();
	}
}
