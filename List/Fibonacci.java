package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Fibonacci {
	
	public List<Integer> list = new ArrayList<Integer>();
	
	public Fibonacci() {
		list.addAll(Arrays.asList(0, 1));
	}
	
	public List<Integer> fulfill() {
		int i = 0;
		while(list.get(list.size()-1) <= 1000000) {
			list.add(list.get(0+i)+list.get(1+i));
			i++;
		}
			
		return list;
	}

}
