package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		Scanner scanner = new Scanner(System.in);
		Pizza pizza = new Pizza();
		
		while (i <= 3) {
			System.out.println("Ingrese el diametro de la pizza [20-30-40]:");
			int diametro = scanner.nextInt();
			System.out.println("Tiene ingredientes especiales? [true - false]:");
			boolean ingredientesEspeciales = scanner.nextBoolean();
			pizza.setDiametro(diametro);
			pizza.setIngredientesEspeciales(ingredientesEspeciales);
			System.out.println("** Pizza "+ i +" **");
			System.out.println("Diametro = " + pizza.getDiametro());
			System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
			System.out.println("Precio Pizza = $" + pizza.calcularPrecio());
			pizza.calcularArea();
			System.out.println("Area de la pizza = " + pizza.getArea());
			i++;
		}
		
	}

}
