package ar.edu.unju.fi.ejercicio17.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		String nombre;
		String apellido;
		String fechaString;
		String nacionalidad;
		float estatura;
		float peso;
		String posicion;
		short opcion = 0;
		Scanner scanner = new Scanner(System.in);
		List<Jugador> lista = new ArrayList<>();
		
		while (opcion != 8) {
			System.out.println("1 - Alta de jugador");
			System.out.println("2 - Mostrar los datos del jugador");
			System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
			System.out.println("4 - Modificar los datos de un jugador");
			System.out.println("5 - Eliminar un jugador");
			System.out.println("6 - Mostrar la cantidad total de jugadores que tiene el ArrayList");
			System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
			System.out.println("8 - Salir");
			System.out.println("\nIngrese una opcion:");
			opcion = scanner.nextShort();
			switch (opcion) {
				case 1:
					System.out.println("Caso1");
					System.out.println("Ingrese Nombre");
					nombre = scanner.next();
					System.out.println("Ingrese Apellido");
					apellido = scanner.next();
					System.out.println("Ingrese Fecha de nacimiento (dd/MM/yyyy)");
					fechaString = scanner.next();
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate fechaNac = LocalDate.parse(fechaString, formatter);
					System.out.println("Ingrese Nacionalidad");
					nacionalidad = scanner.next();
					System.out.println("Ingrese Estatura");
					estatura = scanner.nextFloat();
					System.out.println("Ingrese Peso");
					peso = scanner.nextFloat();
					System.out.println("Ingrese Posicion");
					posicion = scanner.next();
					lista.add(new Jugador(nombre, apellido, fechaNac, nacionalidad, estatura, peso, posicion));
					break;
				case 2:
					System.out.println("Caso2");
					System.out.println("Ingrese nombre a buscar:");
					nombre = scanner.next();
					System.out.println("Ingrese apellido a buscar:");
					apellido = scanner.next();
					for (Jugador l:lista) {
						if (l.getNombre().equals(nombre) && l.getApellido().equals(apellido)) {
							System.out.println(l);
						}
					}
					break;
				case 3:
					System.out.println("Caso 3");
					lista.sort(Comparator.comparing(Jugador::getApellido));
					for (Jugador l:lista) {
						System.out.println(l);
					}
					break;
				case 4:
					System.out.println("Caso 4");
					System.out.println("Ingrese nombre a buscar:");
					nombre = scanner.next();
					System.out.println("Ingrese apellido a buscar:");
					apellido = scanner.next();
					for (Jugador l:lista) {
						if (l.getNombre().equals(nombre) && l.getApellido().equals(apellido)) {
							System.out.println("Ingrese Nueva Fecha de nacimiento (dd/MM/yyyy)");
							fechaString = scanner.next();
							formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
							fechaNac = LocalDate.parse(fechaString, formatter);
							System.out.println("Ingrese Nueva Nacionalidad");
							nacionalidad = scanner.next();
							System.out.println("Ingrese Nueva Estatura");
							estatura = scanner.nextFloat();
							System.out.println("Ingrese Nuevo Peso");
							peso = scanner.nextFloat();
							System.out.println("Ingrese Nueva Posicion");
							posicion = scanner.next();
							l.setFechaNacimiento(fechaNac);
							l.setNacionalidad(nacionalidad);
							l.setEstatura(estatura);
							l.setPeso(peso);
							l.setPosicion(posicion);
						}
					}
					break;
				case 5:
					System.out.println("Caso 5");
					System.out.println("Ingrese nombre a buscar:");
					nombre = scanner.next();
					System.out.println("Ingrese apellido a buscar:");
					apellido = scanner.next();
					Iterator<Jugador> iterator = lista.iterator();
					while (iterator.hasNext()) {
						Jugador l = iterator.next();
						if (l.getNombre().equals(nombre) && l.getApellido().equals(apellido)) {
							iterator.remove();
						}
					}
					for (Jugador l:lista) {
						System.out.println(l);
					}
					break;
				case 6:
					System.out.println("Cantidad total de jugadores:"+lista.size()); 
					break;
				case 7:
					int cont=0;
					System.out.println("Ingrese nacionalidad buscar:");
					nacionalidad = scanner.next();
					for (Jugador l:lista) {
						if(l.getNacionalidad().equals(nacionalidad)) {
							cont++;
						}
					}
					System.out.println("Cantidad de jugadores de "+nacionalidad+" :"+cont);
					break;
				case 8:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Error");
			}
		}
	}

}
