package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero:");
		n = scanner.nextInt();
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		calculadora.setN(n);
		System.out.println("Sumatoria:"+calculadora.calcularSumatoria());
		System.out.println("Productoria:"+calculadora.calcularProductorial());
	}

}
