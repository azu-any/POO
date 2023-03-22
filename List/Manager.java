package p1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Manager {
	public String path = "src/p1/Lists/";
	
	public void ejecutar() throws Exception {
		
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
		File fiboFile = new File(path + "fibo.txt");
		File evenFile = new File(path + "even.txt");
		File oddFile = new File(path + "odd.txt");
		
		Fibonacci fibo = new Fibonacci();
		fibo.fulfill();
		
		Splitter split = new Splitter();
		split.even(fibo.list);
		split.odd(fibo.list);

		
		if (!fiboFile.exists()) {
			try {
				fiboFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if (!evenFile.exists()) {
			try {
				evenFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if (!oddFile.exists()) {
			try {
				oddFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		int i=0;
		
		try (BufferedWriter fWriterF = new BufferedWriter(new FileWriter(fiboFile))) {
			for(i=0; i<fibo.list.size(); i++) {
				fWriterF.write(String.valueOf(fibo.list.get(i)) + '\n');
			}
			fWriterF.close();
			
			}
		
		try (BufferedWriter fWriterE = new BufferedWriter(new FileWriter(evenFile))) {
			for(i=0; i<split.listEven.size(); i++) {
				fWriterE.write(String.valueOf(split.listEven.get(i)) + '\n');
			}
			fWriterE.close();
			}
		
		try (BufferedWriter fWriterO = new BufferedWriter(new FileWriter(oddFile))) {
			for(i=0; i<split.listOdd.size(); i++) {
				fWriterO.write(String.valueOf(split.listOdd.get(i)) + '\n');
			}
			fWriterO.close();
		}
	}
}
