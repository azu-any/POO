package pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.*;

public class Data {
	
	private List<String> names = new ArrayList<String>();
	private int[] count = new int[3000];
	
	public Data() {
		for(int i=0; i<3000; i++){
			count[i] = 0;
		}
	}
 	
	public ArrayList<List<Integer>> read(int n) throws Exception {

		File emails = new File("emails.csv");
		ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
		
		int i=0;
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(emails))) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				if(i==0) {
					String[] values = line.split(",");
					Collections.addAll(names, values);
					names.remove(0);
					names.remove(3000);
					
				} else if(i>=n && i<n+50) {
					String[] values = line.split(",");
					List<String> email = new ArrayList<String>();
					Collections.addAll(email, values);
					email.remove(0);
					email.remove(3000);
					
					List<Integer> listOfInteger = email.stream().map(Integer::parseInt).collect(Collectors.toList());
					list.add(listOfInteger);
				}
				i++;
			}
			    
		}
		return list;
		
	}
	
	public void sum(ArrayList<List<Integer>> list) {
		for(int i=0; i<50; i++) {
			for(int j=0; j<3000; j++) {
				count[j] += list.get(i).get(j);
			}
		}
	}
	
	public void write(String name) throws Exception {
		
		File csvCount = new File(name + ".csv");

		if (!csvCount.exists()) {
			try {
				csvCount.createNewFile();
				
				try (BufferedWriter fWriter = new BufferedWriter(new FileWriter(csvCount))) {
					for(int i=0; i<3000; i++) {
						fWriter.write(names.get(i) + ", " + String.valueOf(count[i]) + '\n');
					}
					fWriter.close();
					
					System.out.println("El archivo fue creado exitosamente");
					}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("El archivo ya existe");
		}
		
	}

}
