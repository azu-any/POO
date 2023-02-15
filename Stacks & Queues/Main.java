package Package1;

public class Main {

	public static void main(String[] args) {

		Queue myQueue = new Queue();
		Stack myStack = new Stack();
		
		Stack myStack2 = new Stack();
		
		myQueue.print();
		myQueue.insert('1');
		myQueue.print();
		myQueue.insert('1');
		myQueue.print();
		myQueue.delete();
		myQueue.print();
		
		System.out.println("\n"); 
		
		myStack.print();
		myStack.push('2');
		myStack.print();
		myStack.push('4');
		myStack.print();
		myStack.pop();
		myStack.print();
		
		myStack2.invertir("Ana");
		myStack2.print();
		System.out.println(myStack2.palindromo("Ana"));
	}

}
