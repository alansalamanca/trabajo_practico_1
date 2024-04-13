package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private int codigo;
	private float precio;
	private int descuento;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	public float calcularDescuento() {
		float precioFinal = 0;
		
		precioFinal = this.precio - (this.precio / 100 * this.descuento);
		
		return precioFinal;
	}
	
	//**************** GETTERS & SETTERS ****************************
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	
}
