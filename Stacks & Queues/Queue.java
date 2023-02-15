package Package1;

import java.util.Arrays;

public class Queue {
	int max = 10;
	char[] myQueue = new char[max];
	int tail = 0;
	
	
	public void insert(char data) {
		if(tail == max) {
			System.out.println("Queue is full"); 
		} else {
			this.myQueue[tail] = data;/* inserts data*/ 
			tail++; /* increases index*/ 
		} 
	} 

	public char delete() {
		if(tail == 0) {
			System.out.println("Queue is empty"); 
			return '#'; 
		} else { 
			char temp = this.myQueue[0];
			this.myQueue[0] = ' ';
			return temp; /*returns eliminated element*/ 
		} 

	}
	
	public void print() {
		System.out.println(Arrays.toString(this.myQueue));
	}

}
