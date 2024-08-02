public class SinglyLinkedList {
    public Node head;
    
    
    public SinglyLinkedList() {
        // your code here
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void addToEnd(int value) {
        Node newNode = new Node(value); // create a new node with the value passed in 
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head; // itterative variable
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    
//    add to front 
    public void addToFront(int value) {
    	Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        }else {
//        	set newNodes next to be the current head
        	newNode.next = head;
//        	set the head to be the newNode
        	head = newNode;
        }
    }
    
    public void addAtIndex(int index, int value) {
    	Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        }else {
        	Node runner = head;
        	for(int idx = 0; idx < index - 1; idx++) {
        		runner = runner.next;
        		System.out.println("STOPPING ON NODE: " + runner.value);
        	}
        	newNode.next = runner.next;
        	runner.next = newNode;
        	
        }
    }
    
    public void removeFromEnd() {
    	if(head == null) {
    		System.out.println("The list is empty");
    	}else {
    		Node runner = head;
    		while(runner.next.next != null) {
    			System.out.println("******************");
    			System.out.println("VALUE: " + runner.value);
    			System.out.println("NEXT: " + runner.next.value);
    			System.out.println("NEXT: " + runner.next.next);
    			System.out.println("******************");
    			runner = runner.next;
    		}
    		runner.next = null;
    	}
    }
    
    public void removeFromFront() {
    	if(head == null) {
    		System.out.println("The list is empty");
    	}else {
    		head = head.next;
    	}
    }
    
//    Remove from a specific "index"
    public void removeAtIndex(int index) {
    	if(head == null) {
    		System.out.println("The list is empty");
    	}else {
    		Node runner = head;
    		for(int idx = 0; idx < index - 1; idx++) {
    			runner = runner.next;
    		}
    		runner.next = runner.next.next;
    		
    	}
    }
    public void printValues() {
    	if(head == null) {
    		System.out.println("The list is empty");
    	}
    	else {
    		Node runner = head;
    		while(runner.next != null) {
    			System.out.println("******************");
    			System.out.println("VALUE: " + runner.value);
    			System.out.println("NEXT: " + runner.next.value);
    			System.out.println("******************");
    			runner = runner.next;
    		}
    	}
    }
    public void find(int valueToFind) {
      	if(head == null) {
    		System.out.println("The list is empty");
    	}
      	else {
    		Node runner = head;
    		while(runner != null) {
    			if(runner.value == valueToFind) {
    				System.out.println("Value is found!");
    				return;
    			}
    			runner = runner.next;
    		}
      	}System.out.println("Value not found in list");
    }
    

}
