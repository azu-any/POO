package Package1;

import java.util.Arrays;

public class Stack {
	int MAX;
	char[] myStack;
	int top;
	String text;
	
	public Stack() {
		this.MAX = 10;
		this.top = 0;
		this.myStack = new char[MAX];
	}
	
	public Stack(String text) {
		String myText = "";
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i) != ' ') {
				myText = myText + text.charAt(i);
			}
		}
			
		this.MAX = myText.length();
		this.top = 0;
		this.text = myText;
		this.myStack = new char[MAX];
	}
	
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
	
	public void invertir() {
		int j = 0;
		for(int i=this.text.length()-1; i>=0; i--) {
			this.myStack[j] = this.text.toLowerCase().charAt(i);
			j++;
		}
	}
	
	public boolean palindromo() {
		this.invertir();
		int j = 0;
		for(int i=0; i<this.text.length(); i++) {
			if(myStack[i] == this.text.toLowerCase().charAt(i)) {
				j++;
			}
		}
		
		if(j==this.text.length()) {
			return true;
		} else {
			return false;
		}
	}

}
