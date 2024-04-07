package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, numeroCopia;
		int factorial = 1;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entre [0-10]");
		numero = scanner.nextInt();
		numeroCopia = numero;
		while (numero > 1 ) {
			factorial = factorial * numero;
			numero--;
		}
		System.out.println(numeroCopia+"! = "+factorial);
	}

}
