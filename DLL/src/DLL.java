
public class DLL {
	public Node head;
	public Node tail;
	
    public DLL() {
        this.head = null;
        this.tail = null;
    }
    public void add(int value) {
    	Node newNode = new Node(value);
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        else {
            Node lastNode = this.tail;
            this.tail.next = newNode;
            newNode.previous = lastNode;
            this.tail = newNode;
        }
    }
    public Node pop() {
    	if(tail == null) {
    		System.out.println("The List is empty");
    		return new Node(0);
    	}else {
    		Node nodeToReturn = tail;
    		tail = tail.previous;
    		tail.next = null;
    		return nodeToReturn;
    	}
    }
    
//     This method prints the values of the nodes from the tail to the head.
    public void printValuesBackwards() {
    	if(tail == null) {
    		System.out.println("List is empty");
    	}else {
    		Node runner = tail;
    		while(runner != null) {
    			System.out.println("**********");
    			System.out.println("VALUE: " + runner.value);
    			runner = runner.previous;
    		}
    	}
    }
    public void printValuesForward() {
        // find the first node, aka head.
        Node runner = this.head;
        
        // while the current node exists...
        while(runner != null) {
            // print its value
            System.out.println("CURRENT NODES VALUE: " + runner.value);
            // and move on to its next node.
            runner = runner.next;
        }
    }
    
    public Boolean contains(int value) {
    	if(head == null) {
    		System.out.println("The list is empty");
    		return false;
    	}else {
    		Node runner = head;
    		while(runner != null) {
    			if(runner.value == value) {
    				System.out.println("FOUND!");
    				return true;
    			}
    			runner = runner.next;
    		}
    		System.out.println("NOT FOUND");
    		return false;
    	}
    }
    public int size() {
    	if(head == null) {
    		System.out.println("List is empty");
    		return 0;
    	}else {
    		int count = 0;
    		Node runner = head;
    		while(runner != null) {
    			count++;
    			runner = runner.next;
    		}
    		System.out.println(count);
    		return count;
    	}
    }
//     Inserts a node at a specific index. For example, let's say that we have 3 nodes in our list. If we call insertAt(newNode, 1), the newNode should be inserted right after the head. (head is index 0)
    
	public void insertAt(int index, int value) {
		if(head == null) {
			System.out.println("List is empty");
		}else if (index == 0) {
//			addToFront(value);
		}else {
			Node runner = head;
			Node newNode = new Node(value);
			for(int i = 0; i < index - 1; i++) {
				runner = runner.next;
			}
			if(runner == tail) {
				add(value);
			}else if(runner != null) {
				System.out.println("RUNNER: " + runner.value);
				System.out.println("RUNNER NEXT PREVIOUS: " + runner.next.previous);
				newNode.next = runner.next;
				runner.next.previous = newNode;
				runner.next = newNode;
				newNode.previous = runner;
			}
		}
		
	}
}
