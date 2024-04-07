package ar.edu.unju.fi.ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pais;
		short edad;
		float alturaEdificio;
		float precioProducto;
		long numeroTelefono;
		double calculo;
		
		pais = "Argentina";
		edad = 20;
		alturaEdificio = 300.4f;
		precioProducto = 3599.99f;
		numeroTelefono = 3448970315l;
		calculo = Math.cos(0.5);
		System.out.println("Pais: "+pais);
		System.out.println("Edad: "+edad);
		System.out.println("Altura edificio: "+alturaEdificio+"m");
		System.out.println("Precio producto: $"+precioProducto);
		System.out.println("Numero de telefono: "+numeroTelefono);
		System.out.println("Calculo coseno de 0.5: "+calculo);
	}

}
