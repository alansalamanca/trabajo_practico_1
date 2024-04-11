package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;
	
	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}
	
	public int calcularSumatoria() {
		int k = 1;
		int calculo = 0;
		
		for (k = 1; k <= this.n; k++) {
			calculo = (int) (calculo + Math.pow((k * (k + 1)) / 2, 2));
		}
		return calculo;
	}
	
	public int calcularProductorial() {
		int k = 1;
		int calculo = 0;
		
		for (k = 1; k <= this.n; k++) {
			calculo = k * (k+4);
		}
		return calculo;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	
}
