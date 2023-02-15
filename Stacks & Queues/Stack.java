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
	
	public void invertir(String text) {
		int j = 0;
		for(int i=text.length()-1; i>=0; i--) {
			this.myStack[j] = text.toLowerCase().charAt(i);
			j++;
		}
	}
	
	public boolean palindromo(String text) {
		this.invertir(text);
		int j = 0;
		for(int i=0; i<text.length(); i++) {
			if(myStack[i] == text.toLowerCase().charAt(i)) {
				j++;
			}
		}
		
		if(j==text.length()) {
			return true;
		} else {
			return false;
		}
	}

}
