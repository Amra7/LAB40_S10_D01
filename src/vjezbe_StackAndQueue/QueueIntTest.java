package vjezbe_StackAndQueue;

public class QueueIntTest {

	public static void main(String[] args) {
		
		QueueInt qi = new QueueInt();
		qi.push(3);
		qi.push(4);
		qi.push(33);
		qi.push(25);
		qi.push(13);
		qi.push(7);
		qi.push(67);
		qi.push(99);
		
		System.out.println("Queue peek: " + qi.peek());
		System.out.println("\nQueue pop: " + qi.pop());		
		System.out.printf("\nQueue size: %d " , qi.getSize());
		System.out.println(qi.contains(25));
	}
}
