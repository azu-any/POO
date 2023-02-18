package P1;

public class Main {

	public static void main(String[] args) {
		int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] matriz2 = {{2,4,6}, {8, 10, 12}, {14, 16, 18}};
		int[][] matriz3 = {{2,4,6}, {8, 10, 12}};
		
		Matrices myMatriz = new Matrices();

		myMatriz.escalar(matriz, 2);
		myMatriz.print();
		
		myMatriz.suma(matriz, matriz2);
		myMatriz.print();
		
		myMatriz.suma(matriz, matriz3);
		myMatriz.print();
		
		System.out.println(myMatriz.maximo(matriz));
		
		System.out.println(myMatriz.diagonal(matriz));
		System.out.println(myMatriz.diagonal(matriz3));
		
		myMatriz.transponer(matriz);
		myMatriz.print();
		
		myMatriz.multiplicar(matriz, matriz2);
		myMatriz.print();
		
		myMatriz.multiplicar(matriz3, matriz2);
		myMatriz.print();
		
		myMatriz.multiplicar(matriz2, matriz3);
		myMatriz.print();
	}

}
