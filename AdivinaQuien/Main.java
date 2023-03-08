package P1;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		Persona[] myPeople = new Persona[10];
		
		String[] nombres = new String[]{"Juan", "Maria", "Ana", "Pedro", "Emi", "Victor", "Yael", "Manuel", "Oscar", "Diego"};
		int[] orden = {0,1,2,3,4,5,6,7,8,9};
		
		
		int k = 10;
		// Creacion aleatoria de los personas
		for(int i=0; i<10;i++) {
			int number = random.nextInt(k);
			
			myPeople[i] = new Persona(nombres[orden[number]]);
			
			// Control de personas unicas
			if(i>0) {
				for(int n=0; n<i; n++) {
					if(myPeople[i] == myPeople[n]) {
						for(int l=0; l<4; l++) {
							if(myPeople[i].getAlto() == myPeople[n].getAlto()) {
								myPeople[i].setAlto(!myPeople[n].getAlto());
							} else if (myPeople[i].getMusica() == myPeople[n].getMusica()) {
								myPeople[i].setMusica(!myPeople[n].getMusica());
							} else if (myPeople[i].getDeporte() == myPeople[n].getDeporte()) {
								myPeople[i].setDeporte(!myPeople[n].getDeporte());
							} else if (myPeople[i].getHermanos() == myPeople[n].getHermanos()) {
								myPeople[i].setHermanos(!myPeople[n].getHermanos());
							}
						}
					} 
				}
			}
			
			// Impresion de los atributos
			System.out.println(i + " " + myPeople[i].getNombre());
			System.out.println("¿Es alto? " + myPeople[i].getAlto());
			System.out.println("¿Practica musica? " + myPeople[i].getMusica());
			System.out.println("¿Practica deporte? " + myPeople[i].getDeporte());
			System.out.println("¿Tiene hermanos? " + myPeople[i].getHermanos());
			System.out.println();
			
			// Eliminacion del nombre elegido por random
			k--;
			for(int j=0;j<10; j++) {
				if(j==number) {
					orden[j] = orden[k];
					orden[k] = 0;
				}
			}
		}
		
		// Impresion de los contadores
		System.out.println("Son altos: " + Humano.getContAlto());
		System.out.println("Practican musica: " + Humano.getContMusica());
		System.out.println("Practican deporte: " + Humano.getContDeporte());
		System.out.println("Tienen hermanos: " + Humano.getContHermanos());

		// Seleccion aleatoria de la persona
		int index = random.nextInt(10);
		
		// Comienza el juego
		System.out.println();
		System.out.println("¡Adivina la persona!");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		// Opciones disponibles
		int[] res = {0,1,2,3,4,5,6,7,8,9};
		
		for(int n=0; n<10; n++) {
			if(res[n] != -1) {
				System.out.println(n + " " + myPeople[n].getNombre());
			}
		}
		System.out.println();
		
		// Preguntas dispobibles
		int[] op = {0,1,2,3};
		String[] ps = new String[]{"1: ¿Es alto?", "2: ¿Practica musica?", "3: ¿Practica deporte?", "4: ¿Tiene hermanos?"};
		
		// Menu de preguntas
		int i = 0;
		while(i<3) {
			
			// Impresion de preguntas no usadas
			for(int j=0; j<4; j++) {
				if(op[j] != -1) {
					System.out.println(ps[j]);
				}
			}
			
			String opcion = scan.nextLine();
			
			// Control de preguntas usadas
			if(Integer.parseInt(opcion) > 0 && Integer.parseInt(opcion) < 5)
				if(op[Integer.parseInt(opcion)-1] == -1) {
					opcion = "-1";
				}
			
			
			switch (opcion) {
			
				case "1":
					System.out.println("¿Es alto? " + myPeople[index].getAlto());
					System.out.println();
					
					// Reducción de opciones disponibles
					for(int n=0; n<10; n++) {
						if(myPeople[index].getAlto() != myPeople[n].getAlto()) {
							res[n] = -1;
						}
					}
					
					// Impresion de opciones disponibles
					for(int n=0; n<10; n++) {
						if(res[n] != -1) {
							System.out.println(n + " " + myPeople[n].getNombre());
						}
					}
					System.out.println();
					
					// Registro de preguntas usadas 
					op[0] = -1;
					i++;
					
					break;
					
				case "2":
					System.out.println("¿Practica musica? " + myPeople[index].getMusica());
					System.out.println();
					
					// Reducción de opciones disponibles
					for(int n=0; n<10; n++) {
						if(myPeople[index].getMusica() != myPeople[n].getMusica()) {
							res[n] = -1;
						}
					}
					
					// Impresion de opciones disponibles
					for(int n=0; n<10; n++) {
						if(res[n] != -1) {
							System.out.println(n + " " + myPeople[n].getNombre());
						}
					}
					System.out.println();
					
					// Registro de preguntas usadas 
					op[1] = -1;
					i++;
					
					break;
					
				case "3":
					System.out.println("¿Practica deporte? " + myPeople[index].getDeporte());
					System.out.println();
					
					// Reducción de opciones disponibles
					for(int n=0; n<10; n++) {
						if(myPeople[index].getDeporte() != myPeople[n].getDeporte()) {
							res[n] = -1;
						}
					}
					
					// Impresion de opciones disponibles
					for(int n=0; n<10; n++) {
						if(res[n] != -1) {
							System.out.println(n + " " + myPeople[n].getNombre());
						}
					}
					System.out.println();
					
					// Registro de preguntas usadas 
					op[2] = -1;
					i++;
					
					break;
					
				case "4":
					System.out.println("¿Tiene hermanos? " + myPeople[index].getHermanos());
					System.out.println();
					
					// Reduccion de opciones disponibles					
					for(int n=0; n<10; n++) {
						if(myPeople[index].getHermanos() != myPeople[n].getHermanos()) {
							res[n] = -1;
						}
					}
					
					// Impresion de opciones disponibles
					for(int n=0; n<10; n++) {
						if(res[n] != -1) {
							System.out.println(n + " " + myPeople[n].getNombre());
						}
					}
					System.out.println();
					
					// Registro de preguntas usadas 
					op[3] = -1;
					i++;
					
					break;
					
				case "-1":
					System.out.println("Pregunta ya usada. Digite otra opcion. Le resta(n) " + (3-i) + " pregunta(s)");
					System.out.println();
					continue;
					
				default:
					System.out.println("Opcion invalida. Digite otra opcion. Le resta(n) " + (3-i) + " pregunta(s)");
					System.out.println();
					continue;
			}
		}
		
		System.out.println("¿Quien es?");
		
		for(int n=0; n<10; n++) {
			if(res[n] != -1) {
				System.out.println(n + " " + myPeople[n].getNombre());
			}
		}
		System.out.println();
		
		String respuesta = scan.nextLine();
		if(Integer.parseInt(respuesta) == index) {
			System.out.println("¡Felicidades ganaste!");
		} else {
			System.out.println("Perdiste. La respuesta era: " + myPeople[index].getNombre());
		}
		
		scan.close();
	}

}