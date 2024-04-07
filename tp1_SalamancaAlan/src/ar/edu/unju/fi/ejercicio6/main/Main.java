package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long dni;
		String nombre;
		short dia, mes, anio;
		String provincia;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("******** OBJETO 1 ********");
		System.out.println("Ingrese dni:");
		dni = scanner.nextLong();
		System.out.println("Ingrese nombre:");
		nombre = scanner.next();
		System.out.println("Ingrese año de nacimiento:");
		anio = scanner.nextShort();
		System.out.println("Ingrese mes de nacimiento:");
		mes = scanner.nextShort();
		System.out.println("Ingrese dia de nacimiento:");
		dia = scanner.nextShort();
		System.out.println("Ingrese provincia:");
		provincia = scanner.next();
		Persona pepito = new Persona();
		pepito.setDni(dni);
		pepito.setNombre(nombre);
		pepito.setFechaNacimiento(LocalDate.of(anio, mes, dia));
		pepito.setProvincia(provincia);
		pepito.mostrarDatos();
		
		System.out.println("******** OBJETO 2 ********");
		System.out.println("Ingrese dni:");
		dni = scanner.nextLong();
		System.out.println("Ingrese nombre:");
		nombre = scanner.next();
		System.out.println("Ingrese año de nacimiento:");
		anio = scanner.nextShort();
		System.out.println("Ingrese mes de nacimiento:");
		mes = scanner.nextShort();
		System.out.println("Ingrese dia de nacimiento:");
		dia = scanner.nextShort();
		System.out.println("Ingrese provincia:");
		provincia = scanner.next();
		Persona pepito2 = new Persona(dni, nombre, LocalDate.of(anio, mes, dia), provincia);
		pepito2.mostrarDatos();
		
		System.out.println("******** OBJETO 3 ********");
		System.out.println("Ingrese dni:");
		dni = scanner.nextLong();
		System.out.println("Ingrese nombre:");
		nombre = scanner.next();
		System.out.println("Ingrese año de nacimiento:");
		anio = scanner.nextShort();
		System.out.println("Ingrese mes de nacimiento:");
		mes = scanner.nextShort();
		System.out.println("Ingrese dia de nacimiento:");
		dia = scanner.nextShort();
		Persona pepito3 = new Persona(dni, nombre, LocalDate.of(anio, mes, dia));
		pepito3.mostrarDatos();
		
	}

}
