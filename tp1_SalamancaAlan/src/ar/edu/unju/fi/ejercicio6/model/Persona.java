package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {
	private Long dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(Long dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	
	public Persona(Long dni, String nombre, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}
	
	public int calcularEdad() {
		int edad;
		
		edad=2024-fechaNacimiento.getYear();
		return edad;
	}
	
	public boolean verificarEdad() {
		boolean mayorEdad = false;
		
		if (calcularEdad() >= 18) {
			mayorEdad = true;
		}
		return mayorEdad;
	}
	
	public void mostrarDatos() {
		System.out.println(dni);
		System.out.println(nombre);
		System.out.println(fechaNacimiento);
		System.out.println(provincia);
		System.out.println("Edad:"+calcularEdad());
		if(verificarEdad() == true) {
			System.out.println("Es mayor de edad");
		}
		else {
			System.out.println("No es mayor de edad");
		}
		
	}
	
	// GETTERS AND SETTERS ******************************************
	public Long getDni() {
		return dni;
	}
	public void setDni(Long dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
}
