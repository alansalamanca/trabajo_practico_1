package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int tamanio;
		String nombre;
		
		do {
			System.out.println("Ingrese un numero entre [5,10]:");
			tamanio = scanner.nextInt();
		} while (tamanio < 5 || tamanio > 10);
		
		String[] personas = new String[tamanio];
		
		for (int i = 0; i < personas.length; i++) {
			System.out.println("Ingrese nombre:");
			nombre = scanner.next();
			personas[i] = nombre;
		}
		
		for (int j = 0; j < personas.length; j++) {
			System.out.println("Nombre en la posicion "+j+" - "+personas[j]);
		}
		
		System.out.println("\n");
		
		for (int k = personas.length-1; k >= 0; k--) {
			System.out.println("Nombre en la posicion "+k+" - "+personas[k]);
		}
		
	}

}
