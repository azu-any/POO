package p1;

import java.util.ArrayList;
import java.util.List;

public class Splitter {
	
	public List<Integer> listEven = new ArrayList<Integer>();
	public List<Integer> listOdd = new ArrayList<Integer>();
	
	public List<Integer> even(List<Integer> list) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) % 2 == 0) {
				this.listEven.add(list.get(i));
			}	
		}
			
		return listEven;
	}
	
	public List<Integer> odd(List<Integer> list) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) % 2 != 0) {
				this.listOdd.add(list.get(i));
			}	
		}
			
		return listOdd;
	}


}
