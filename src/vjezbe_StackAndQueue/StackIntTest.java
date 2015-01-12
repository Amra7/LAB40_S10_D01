package vjezbe_StackAndQueue;

public class StackIntTest {
	
	public static void main(String[] args) {
		StackInt si = new StackInt();
		si.push(2);
		si.push(4);
		si.push(5);
		si.push(6);
		si.push(7);
		
		System.out.printf("Stack contains %d - %b", 4, si.contains(4));		
		System.out.printf("\nStack pop last %d", si.pop());
		System.out.printf("\nStack size %d", si.getSize());
		System.out.println("\n" + si.toString());
	}
}
