package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int tamanio, num, suma = 0;
		
		do {
			System.out.println("Ingrese un numero en el rango [3,10]");
			tamanio = scanner.nextInt();
		} while (tamanio < 3 || tamanio > 10);
		
		int[] numeros = new int[tamanio];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese numero:");
			num = scanner.nextInt();
			numeros[i] = num;
		}
		
		for (int j = 0; j < numeros.length; j++) {
			suma = suma + numeros[j];
			System.out.println("Numero en la posicion "+j+" - "+numeros[j]);
		}
		System.out.println("La suma de todos los valores es:"+suma);
	}

}
