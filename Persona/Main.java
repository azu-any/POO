package P1;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		Persona[] myPeople = new Persona[10];
		String[] nombres = new String[]{"Juan", "Maria", "Ana", "Pedro", "Emi", "Victor", "Yael", "Manuel", "Oscar", "Diego"};
		
		int[] Orden = {0,1,2,3,4,5,6,7,8,9};
		
		int k = 10;
		
		for(int i=0; i<10;i++) {
			int number = random.nextInt(k);
			
			
			myPeople[i] = new Persona(nombres[Orden[number]]);
			
			System.out.println(myPeople[i].getNombre());
			System.out.println("¿Es alto?" + myPeople[i].getAlto());
			System.out.println("¿Practica musica?" + myPeople[i].getMusica());
			System.out.println("¿Practica deporte?" + myPeople[i].getDeporte());
			System.out.println("¿Tiene hermanos?" + myPeople[i].getHermanos());
			System.out.println();
			
			k--;
			for(int j=0;j<10; j++)
			{
				if(j==number) {
					Orden[j] = Orden[k];
					Orden[k] = 0;
				}
			}
		}
		
		
		System.out.println("Son altos: " + Humano.getContAlto());
		System.out.println("Practican musica: " + Humano.getContMusica());
		System.out.println("Practican deporte: " + Humano.getContDeporte());
		System.out.println("Tienen hermanos: " + Humano.getContHermanos());

		int index = random.nextInt(10);
		
		System.out.println();
		System.out.println("¡Adivina la persona!");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("1. ¿Es alto?");
			System.out.println("2. ¿Practica musica?");
			System.out.println("3. ¿Practica deporte?");
			System.out.println("4. ¿Tiene hermanos?");
			
			String opcion = scan.nextLine();
			
			switch (opcion) {
				case "1":
					System.out.println("¿Es alto? " + myPeople[index].getAlto());
					System.out.println();
					break;
					
				case "2":
					System.out.println("¿Practica musica? " + myPeople[index].getMusica());
					System.out.println();
					break;
					
				case "3":
					System.out.println("¿Practica deporte? " + myPeople[index].getDeporte());
					System.out.println();
					break;
					
				case "4":
					System.out.println("¿Tiene hermanos? " + myPeople[index].getHermanos());
					System.out.println();
					break;
					
				default:
					System.out.println("Opcion invalida. Digite otra opcion");
					System.out.println();
					continue;
			}
		}
		
		System.out.println("¿Quien es?");
		
		int n = 0;
		for(Persona Per: myPeople) {
			System.out.println(n + " " + Per.getNombre());
			n++;
		}
		
		String respuesta = scan.nextLine();
		if(Integer.parseInt(respuesta) == index) {
			System.out.println("¡Felicidades ganaste!");
		} else {
			System.out.println("Perdiste. La respuesta era: " + myPeople[index].getNombre());
		}
		
		scan.close();

	}

}
