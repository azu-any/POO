package P1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nombre de usuario:");
		String nombre = scan.nextLine() + ".txt";
		
		Menu menu = new Menu(nombre);
		
		
		int i = 1;
		while(i==1) {
			System.out.println("Eliga una opicon: \n1: Jugar\n2: Salir");
			i = Integer.parseInt(scan.nextLine());
			
			if(i==2) {
				menu.save();
				scan.close();
				System.out.println("Nos vemos.");
				System.exit(0);
			} else if (i!=1) {
				System.out.println("Opcion invalida. intente de nuevo.");
			} else {
				Game game = new Game();
				game.contadores();
				game.guessWho();
				menu.winner(game.check());
				menu.game();
			}	
		}
	}
}