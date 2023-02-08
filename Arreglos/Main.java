package P1;

public class Main {

	public static void main(String[] args) {
	
		int enteros[] = new int[15];
		
		String nombres[] = new String[20];
		
		Array objetos[] = new Array[100];
		
		enteros[9] = 5;
		
		nombres[0] = "Francisco";
		
		Array prueba = new Array();
		
		prueba.Show(enteros);
		
		prueba.Show(nombres);
		
		prueba.Show(objetos);
		
		prueba.Look(enteros, 5);
		
		prueba.Look(nombres, "Francisco");
		
		prueba.Delete(enteros, 5);
		prueba.Show(enteros);
		
		prueba.Delete(nombres, "Francisco");
		prueba.Show(nombres);

	}

}
