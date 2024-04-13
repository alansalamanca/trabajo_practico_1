package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int descuento;
		Scanner scanner = new Scanner(System.in);
		
		Producto producto = new Producto();
		while (i < 3) {
			System.out.println("\nNombre del producto:");
			String nombre = scanner.next();
			System.out.println("Codigo del producto:");
			int codigo = scanner.nextInt();
			System.out.println("Precio del producto:");
			float precio = scanner.nextFloat();
			do {
				System.out.println("Descuento del producto [0-50]:");
				descuento = scanner.nextInt();
			}while (descuento < 0 || descuento > 50 );
			
			producto.setNombre(nombre);
			producto.setCodigo(codigo);
			producto.setPrecio(precio);
			producto.setDescuento(descuento);
			producto.getNombre();
			System.out.println("Nombre del producto: " + producto.getNombre());
			System.out.println("Codigo del producto: " + producto.getCodigo());
			System.out.println("Precio del producto: " + producto.getPrecio());
			System.out.println("Descuento del producto: $" + producto.calcularDescuento());
			i++;
		}
		
		
		
		
		
		
	}

}
