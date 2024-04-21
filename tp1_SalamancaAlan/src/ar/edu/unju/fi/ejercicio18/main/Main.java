package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		String codigo;
		String nombre;
		float precio;
		String codigoPais;
		String nombrePais;
		short cantidadDeDias;
		short opcion = 0;
		Scanner scanner = new Scanner(System.in);
		
		List<DestinoTuristico> destinos = new ArrayList<>();
		while (opcion != 9) {
			System.out.println("1 - Alta de destino turistico");
			System.out.println("2 - Mostrar todos los destinos turisticos");
			System.out.println("3 - Modificar el pais de un destino turistico");
			System.out.println("4 - Limpiar el ArrayList de destinos turisticos");
			System.out.println("5 - Eliminar un destino turistico");
			System.out.println("6 - Mostrar los destinos turisticos ordenados por nombre");
			System.out.println("7 - Mostrar todos los paises");
			System.out.println("8 - Mostrar los destinos turisticos que pertenecen a un pais");
			System.out.println("9 - Salir");
			System.out.println("\nDigite una opcion:");
			opcion = scanner.nextShort();
			
			switch (opcion) {
				case 1:
					System.out.println("Ingrese codigo:");
					codigo = scanner.next();
					System.out.println("Ingrese nombre:");
					nombre = scanner.next();
					System.out.println("Ingrese precio");
					precio = scanner.nextFloat();
					System.out.println("Ingrese codigo pais");
					codigoPais = scanner.next();
					System.out.println("Ingrese nombre pais");
					nombrePais = scanner.next();
					Pais pais = new Pais(codigoPais, nombrePais);
					System.out.println("Ingrese cantidad de dias");
					cantidadDeDias = scanner.nextShort();
					destinos.add(new DestinoTuristico(codigo, nombre, precio, pais, cantidadDeDias));
					break;
				case 2:
					for (DestinoTuristico l:destinos) {
						System.out.println(l);
					}
					break;
				case 3:
					System.out.println("Ingrese codigo de destino turistico");
					codigo = scanner.next();
					for (DestinoTuristico l:destinos) {
						if(l.getCodigo().equals(codigo)) {
							System.out.println("Ingrese nuevo nombre:");
							nombre = scanner.next();
							System.out.println("Ingrese nuevo precio:");
							precio = scanner.nextFloat();
							System.out.println("Ingrese nuevo codigo pais:");
							codigoPais = scanner.next();
							System.out.println("Ingrese nuevo nombre pais:");
							nombrePais = scanner.next();
							Pais nuevoPais = new Pais(codigoPais, nombrePais);
							System.out.println("Ingrese nueva cantidad de dias:");
							cantidadDeDias = scanner.nextShort();
							l.setNombre(nombre);
							l.setPrecio(precio);
							l.setPais(nuevoPais);
							l.setCantidadDeDias(cantidadDeDias);
						}
					}
					break;
				case 4:
					System.out.println("Limpiando ArrayList...");
					destinos.clear();
					break;
				case 5:
					System.out.println("Ingrese el codigo de destino turistico");
					codigo = scanner.next();
					Iterator<DestinoTuristico> iterator = destinos.iterator();
					while (iterator.hasNext()) {
						DestinoTuristico l = iterator.next();
						if (l.getCodigo().equals(codigo)) {
							iterator.remove();
						}
					}
					break;
				case 6:
					destinos.sort(Comparator.comparing(DestinoTuristico::getNombre));
					for (DestinoTuristico l:destinos) {
						System.out.println(l);
					}
					break;
				case 7:
					System.out.println("Paises del destino turistico:");
					for (DestinoTuristico l:destinos) {
						System.out.println(l.getPais().getNombre());
					}
					break;
				case 8:
					System.out.println("Ingrese el codigo del pais:");
					codigoPais = scanner.next();
					for (DestinoTuristico l:destinos) {
						if (l.getPais().getCodigo().equals(codigoPais)) {
							System.out.println(l.getNombre());
						}
					}
					break;
				default:
					System.out.println("ERROR");
			}
		}

	}

}
