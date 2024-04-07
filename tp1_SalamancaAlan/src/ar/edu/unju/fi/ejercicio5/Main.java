package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, i;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese un numero entre [1-9]:");
			numero = scanner.nextInt();
		} while(numero < 1 || numero > 9);
		for (i=0; i<=10; i++) {
			System.out.println(numero+" x "+i+" = "+numero*i);
		}
	}

}
