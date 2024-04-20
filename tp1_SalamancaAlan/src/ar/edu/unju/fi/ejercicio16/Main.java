package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] personas = new String[5];
		String nombre;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < personas.length; i++) {
			System.out.println("Ingrese nombre:");
			nombre = scanner.next();
			personas[i] = nombre;
		}
		
		int j = 0;
		while (j < personas.length) {
			System.out.println("Nombre en la posicion "+j+" - "+personas[j]);
			j++;
		}
		System.out.println("\nTamanio del array: "+personas.length);
		short indice;
		System.out.println("Ingrese un indice: ");
		indice = scanner.nextShort();
		int k = 0;
		do {
			if(k >= indice) {
				personas[k] = personas[k+1];
			}
			if (k + 1 == 4) {
				personas[k+1] = "";
			}
			System.out.println("Iterador:"+k);
			k++;
		} while (k < personas.length-1);
		for (k = 0; k < personas.length; k++) {
			System.out.println("Nombre en la posicion "+k+" - "+personas[k]);
		}
		
	}

}
