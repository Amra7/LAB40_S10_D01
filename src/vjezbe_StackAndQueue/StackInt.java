package vjezbe_StackAndQueue;

/**
 * Class Stack of integers.
 * 
 * @author amrapoprzanovic
 *
 */
public class StackInt {

	private Node head;

	public StackInt() {
		head = null;
	}

	/**
	 * Push new element on last place of link.
	 * @param value - new Vale that we put in Queue.
	 */
	public void push(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;

	}

	/**
	 * Pop out integer from stack.
	 * 
	 * @return - last integer from stack
	 */
	public int pop() {
		if( head == null){
			throw new NullPointerException("Stack is empty");
		}
		Node current = head;
		head = head.next;
		int value = current.value;
		current = null;

		return value;
	}

	/**
	 * Peeks value of first element we pushed.
	 * @return value of first element.
	 */
	public int peek() {
		if( head == null){
			throw new NullPointerException("Stack is empty");
		}
		return head.value;
	}

	/**
	 * Get Size.
	 * @return size of linked list.
	 */
	public int getSize(){
    	if (head== null){
    		return 0;
    	}
    	return getSize(head,0); // prosljedjuje se vrijednost jedan zato sto ako vec postoji head to znaci da imamo makar jedan clan
    }

	private int getSize(Node current, int counter) {
		if (current == null) {
			return counter;
		} 
			return getSize(current.next, counter + 1);
	
	}
	
	/**
	 * Contains  value.
	 * @param value - value that we forwarding.
	 * @return true if it contains value or false if it does not.
	 */
	public boolean contains(int value){
		if ( head.value == value){
			return true;
		}
		return contains(head, value);
	}

	private boolean contains(Node current, int value) {
		if ( current == null)
			return false;
		if ( current.value == value)
			return true;
		return contains(current.next, value);
	}
	
	/**
	 * Converts all elements of Queue in String.
	 */
	public String toString(){
		String str = "";
		Node current = head;
		str += "[ ";
		while(current != null){
			str += current.value;
			if(current.next != null)
				str += ", ";
			current = current.next;
		}
		str += " ]";
		return str;
	}

	/**
	 * Inner class Node
	 * 
	 * @author amrapoprzanovic
	 *
	 */
	private class Node {
		public int value;
		public Node next;

		/**
		 * Constructor for Node.
		 * 
		 * @param value
		 */
		public Node(int value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getValue() {
			return value;
		}
	}
}
