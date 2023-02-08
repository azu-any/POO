package P1;

import java.util.Arrays;

public class Array {

	public void Show(String[] arreglo) {
		System.out.println(Arrays.deepToString(arreglo));
	}
	
	public void Show(int[] arreglo) {
		System.out.println(Arrays.toString(arreglo));
	}
	
	public void Show(Array[] arreglo) {
		System.out.println(Arrays.toString(arreglo));
	}
	
	public void Look(String[] arreglo, String word) {
		int i=0, j=0;
		
		for(String c : arreglo) {
			if(word.equals(c)) {
				System.out.println("Se encontro en la posicion: " + i);
				j++;
			}
			i++;
		}
		
		if(j==0) {
			System.out.println("Elemento no encontrado.");
		}
	}
	
	public void Look(int[] arreglo, int number) {
		int i=0, j=0;
		
		for(int c : arreglo) {
			if(number == c) {
				System.out.println("Se encontro en la posicion: " + i);
				j++;
			}
			i++;
		}
		
		if(j==0) {
			System.out.println("Elemento no encontrado.");
		}
	}
	
	public void Delete(int[] arreglo, int number) {
		int i=0;
		int flag=-1;
		
		for(int c : arreglo) {
			if(number == c) {
				flag = i;
				break;
			}
			i++;
		}	
		
		if(flag>=0) {		
			for(int j=0; j<=arreglo.length-1; j++) {
				if(j >= flag && j<arreglo.length-1) {
					arreglo[j]= arreglo[j+1];
				} else if(j==arreglo.length-1) {
					arreglo[j] = 0;
				}
			}
		} else {
			System.out.println("Elemento no encontrado.");
		}
		
	}
	
	public void Delete(String[] arreglo, String word) {
		int i=0;
		int flag=-1;
		
		for(String c : arreglo) {
			if(word == c) {
				flag = i;
				break;
			}
			i++;
		}	
		
		if(flag>=0) {		
			for(int j=0; j<=arreglo.length-1; j++) {
				if(j >= flag && j<arreglo.length-1) {
					arreglo[j]= arreglo[j+1];
				} else if(j==arreglo.length-1) {
					arreglo[j] = "null";
				}
			}
		} else {
			System.out.println("Elemento no encontrado.");
		}
		
	}
	
	
}