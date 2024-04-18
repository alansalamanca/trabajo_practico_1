package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		int dia, mes, anio;
		Calendar fechaNacimiento = Calendar.getInstance();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese nombre:");
		nombre = scanner.next();
		System.out.println("Ingrese dia de nacimiento:");
		dia = scanner.nextInt();
		System.out.println("Ingrese mes de nacimiento:");
		mes = scanner.nextInt();
		System.out.println("Ingrese año de nacimiento:");
		anio = scanner.nextInt();
		fechaNacimiento.set(anio, mes, dia);
		
		Persona persona = new Persona(nombre, fechaNacimiento);
		
		System.out.println("Nombre:" + nombre);
		System.out.println("Fecha nacimiento: " + dia+"/"+mes+"/"+anio);
		System.out.println("Edad: " + persona.calcularEdad());
		System.out.println("Signo del sodiaco: " + persona.calcularSigno());
		System.out.println("Estacion: " + persona.calcularEstacionAnio());
		
	}

}
