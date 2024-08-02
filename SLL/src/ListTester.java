public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addToEnd(3);
        sll.addToEnd(4);
        sll.addToEnd(10);
        sll.addToEnd(5);
        sll.addToEnd(15);
        sll.addToEnd(2);
        sll.addToEnd(20);
        sll.addAtIndex(2, 6);
//        sll.addToFront(14);
//        sll.removeFromEnd(); 
//        sll.removeFromEnd(); 
//        sll.removeFromFront();
//        sll.removeAtIndex(2);
        sll.printValues();
//        sll.find(0);
//        sll.find(2);
//        sll.find(20);
//        sll.find(5);
    }
}
