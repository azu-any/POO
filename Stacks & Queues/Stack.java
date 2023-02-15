package Package1;

import java.util.Arrays;

public class Stack {
	int MAX = 10;
	char[] myStack = new char[MAX];;
	int top = 0;
	
	public char pop() { 
		if(top == 0) {
			System.out.println("Stack is empty"); 
			return '#'; 
		} else { 
			top--; /* decreases top */ 
			char temp = this.myStack[top];
			this.myStack[top] = ' ';
			return temp; /*returns eliminated element*/ 
		} 
	}
	
	public void push(char data) { 
		if(top == MAX) {
			System.out.println("Stack is full");
		} else { 
			myStack[top] = data; /* adds element*/
			top++; /* increases top */ 
		} 
	} 

	public void print() {
		System.out.println(Arrays.toString(myStack));
	}

}
