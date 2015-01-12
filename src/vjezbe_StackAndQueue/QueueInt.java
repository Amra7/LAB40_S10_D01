package vjezbe_StackAndQueue;

public class QueueInt {

	private Node head;
	private Node tail;
	
	public QueueInt(){
		head= null;
		tail=null;
	}
	
	/**
	 * Push value in last place in  QueueInt
	 * @param value - new value that we push.
	 */
	public void push(int value){
		Node newNode = new Node(value);
		if (head == null){
			head = newNode;	
			tail = head;

			return;
		}
		
		tail.next = newNode;
		tail=tail.next;
	}
	
	/**
	 * Pop first value that we push.
	 * @return first value that we push.
	 */
	public int pop(){
		if ( head == null)
			throw new NullPointerException("Stack is empty");
		if ( head == tail){
			Node current = head;
			int value = current.value;
			head = tail = null;
			return value;
		}
		Node current = head;
		int value = current.value;
		head = head.next;
		current = null;
		return value;
	}
	
	/**
	 * Peeks value of first element we pushed.
	 * @return value of first element.
	 */
	public int peek(){
		if ( head == null)
			throw new NullPointerException("Stack is empty");
		return head.value;
	}
	
	/**
	 * Get Size.
	 * @return size of linked list.
	 */
	public int getSize(){
		if (head == null){
			return 0;
		}			
		return getSize(head,0);
	}
	
	private int getSize(Node current, int counter) {
		if(current == null){
			return counter;
		}
		return getSize(current.next, counter +1);
	}
	
	/**
	 * Contains  value.
	 * @param value - value that we forwarding.
	 * @return true if it contains value or false if it does not.
	 */
	
	public boolean contains(int value){
		if ( head.value == value)
			return true;
		return contains(head, value);
	}

	private boolean contains(Node current, int value) {
		if ( current == null){
			return false;
		} 
		if (current.value == value){
			return true;
		} 
			return contains(current.next, value);
		

	}



	/**
	 * Inner class Node
	 * @author amrapoprzanovic
	 *
	 */
	private class Node{
		public int value;
		public Node next;
		
		public Node(int value){
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
