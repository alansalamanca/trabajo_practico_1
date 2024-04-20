package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[8];
		int num;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese un numero:");
			num = scanner.nextInt();
			numeros[i] = num;
		}
		
		for (int j = 0; j < numeros.length; j++) {
			System.out.println("Numero en la posicion "+j+" - "+numeros[j]);
		}
	}

}
