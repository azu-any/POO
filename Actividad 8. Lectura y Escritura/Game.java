package P1;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	
	private Persona[] myPeople = new Persona[10];
	private int[] res = {0,1,2,3,4,5,6,7,8,9};
	private int index = random.nextInt(10);
	
	public Game() {
		
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
					if(myPeople[i].getAlto() == myPeople[n].getAlto() && myPeople[i].getMusica() == myPeople[n].getMusica() && myPeople[i].getDeporte() == myPeople[n].getDeporte() && myPeople[i].getHermanos() == myPeople[n].getHermanos()) {
						int rand = random.nextInt(4);
						
						switch(rand) {
							
							case 0:
								myPeople[i].setAlto(!myPeople[n].getAlto());
								break;
							
							case 1:
								myPeople[i].setMusica(!myPeople[n].getMusica());
								break;
						
							case 2:
								myPeople[i].setDeporte(!myPeople[n].getDeporte());
								break;
							
							case 3:
								myPeople[i].setHermanos(!myPeople[n].getHermanos());
								break;
								
							default:
								break;
						}
						n = 0;
					} 
				}
			}
	
			System.out.println(i);
			myPeople[i].printInfo();
			
			// Eliminacion del nombre elegido por random
			k--;
			for(int j=0;j<10; j++) {
				if(j==number) {
					orden[j] = orden[k];
					orden[k] = 0;
				}
			}
		}
	}
	
	public void contadores() {
		System.out.println("Son altos: " + Humano.getContAlto());
		System.out.println("Practican musica: " + Humano.getContMusica());
		System.out.println("Practican deporte: " + Humano.getContDeporte());
		System.out.println("Tienen hermanos: " + Humano.getContHermanos());
	}

	public void guessWho() {
	
		System.out.println();
		System.out.println("¡Adivina la persona!");
		System.out.println();
		
		this.options();
		
		// Preguntas dispobibles
		int[] op = {0,1,2,3};
		String[] ps = new String[]{"1: ¿Es alto?", "2: ¿Practica musica?", "3: ¿Practica deporte?", "4: ¿Tiene hermanos?"};
		
		// Menu de preguntas
		int i = 0;
		while(i<3) {
			
			System.out.println("Eliga una pregunta:");
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
					this.options();
					
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
					this.options();
					
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
					this.options();
					
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
					this.options();
					
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
			
	}
	
	public void options() {
		for(int n=0; n<10; n++) {
			if(this.res[n] != -1) {
			System.out.println(n + " " + myPeople[n].getNombre());
			}
		}
		System.out.println();
	}
	
	public int check() {
	
		System.out.println("¿Quien es?");
		this.options();
	
		String respuesta = scan.nextLine();
		if(Integer.parseInt(respuesta) == this.index) {
			System.out.println("¡Felicidades ganaste!");
			return 1;
		
		} else {
			System.out.println("Perdiste. La respuesta era: " + myPeople[index].getNombre());
			return 0;
		}
	}
}
