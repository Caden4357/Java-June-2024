
public class Tester {
	public static void main(String[] args) {
		DLL dll = new DLL();
		dll.add(4);
		dll.add(6);
		dll.add(2);
		dll.add(9);
//		dll.printValuesForward();
//		dll.pop();
//		dll.printValuesBackwards();
//		dll.contains(9);
//		dll.contains(2);
//		dll.size();
		dll.insertAt(2, 8);
		dll.printValuesForward();
	}
}
