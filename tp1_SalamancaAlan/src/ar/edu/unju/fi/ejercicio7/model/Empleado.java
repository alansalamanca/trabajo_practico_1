package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private int legajo;
	private float salario;
	final float SALARIO_MIN = (float) 210000.00;
	final float AUMENTO_MERITO = (float) 20000.00;
	
	public Empleado(String nombre, int legajo, float salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		if (salario >= SALARIO_MIN) {
			this.salario = salario;
		}
		else {
			this.salario = SALARIO_MIN;
		}
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre del empleado: "+nombre);
		System.out.println("Legajo: "+legajo);
		System.out.println("Salario $: "+salario);
	}
	
	public void aumentarSalario() {
		salario = salario + AUMENTO_MERITO;
	}
	
	
}
