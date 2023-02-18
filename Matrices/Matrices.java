package P1;

import java.util.Arrays;

public class Matrices {
	int filas = 3;
	int columnas = 3;
	int[][] matriz = new int[filas][columnas];
	
	public Matrices() {
		this.Zero();
	}
	
	public void Zero() {
		for(int i=0; i<this.matriz.length; i++) {
			for(int j=0; j<this.matriz[0].length; j++) {	
				this.matriz[i][j] = 0;
			}
		}
	}
	
	public Matrices(int[][] matriz) {
		this.matriz = matriz;
		this.filas = matriz.length;
		this.columnas = matriz[0].length;
	}
	
	public int[][] multiplicar(int[][] matrizA, int[][] matrizB) {
		if(matrizA[0].length == matrizB.length) {
			int[][] matriz = new int[matrizA.length][matrizB[0].length];
			for(int i=0; i<matrizA.length; i++) {
	            for (int j=0; j<matrizB[0].length; j++) {
	                for (int k = 0; k < matrizB.length; k++)
	                    matriz[i][j] += matrizA[i][k] * matrizB[k][j];
	            }
	        }
			this.matriz = matriz;
		} else {
			System.out.println("No se pueden multiplicar las matrices");
			this.Zero();
		}
	
		return this.matriz;
	}
	
	public int[][] transponer(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {	
				this.matriz[j][i] = matriz[i][j];
			}
		}
		return this.matriz;

	}
	
	public int diagonal(int[][] matriz) {
		int diagonal = 0;
		if(matriz.length == matriz[0].length) {
			for(int i=0; i<matriz.length; i++) {
				diagonal += matriz[i][i];
			}
		} else {
			System.out.println("La matriz no es cuadradada. No se puede obtener la suma de la diagonal.");
		}
		return diagonal;
	}
	
	public int maximo(int[][] matriz) {
		int max = matriz[0][0];
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {	
				if (matriz[i][j] > max) {
					max = matriz[i][j];
				}
			}
		}
		return max;
	}
	
	public int[][] suma(int[][] matrizA, int[][] matrizB) {
		if(matrizA.length == matrizB.length && matrizA[0].length == matrizB[0].length) {
			for(int i=0; i<matrizA.length; i++) {
				for(int j=0; j<matrizA[0].length; j++) {	
					this.matriz[i][j] = matrizA[i][j] + matrizB[i][j];
				}
			}
		} else {
			System.out.println("Las matrices no se pueden sumar");
			this.Zero();
		}
		
		return this.matriz;
	}
	
	public int[][] escalar(int[][] matriz,int escalar) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {	
				this.matriz[i][j] = escalar*matriz[i][j];
			}
		}
		return this.matriz;
	}
	
	public void print() {
		System.out.println(Arrays.deepToString(this.matriz));
	}

}
