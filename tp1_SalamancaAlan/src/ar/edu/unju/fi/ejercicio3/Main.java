package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero:");
		numero = scanner.nextInt();
		if (numero % 2 == 0) {
			numero = (int) Math.pow(numero, 2);
			System.out.println(numero);
		}
		else {
			numero = (int) Math.pow(numero, 3);
			System.out.println(numero);
		}
		
	}

}
