package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private int precio;
	private float area;
	private boolean ingredientesEspeciales;
	private final int ADICIONAL_INGREDIENTES_ESPECIALES_20 = 500;
	private final int ADICIONAL_INGREDIENTES_ESPECIALES_30 = 750;
	private final int ADICIONAL_INGREDIENTES_ESPECIALES_40 = 1000;
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	
	public int calcularPrecio() {
		int precioFinal = 0;
		
		if (this.diametro == 20 && this.ingredientesEspeciales == false) {
			precioFinal = 4500;
		}
		else {
			if (this.diametro == 20 && this.ingredientesEspeciales == true) {
				precioFinal = 4500 + ADICIONAL_INGREDIENTES_ESPECIALES_20;
			}
			else {
				if (this.diametro == 30 && this.ingredientesEspeciales == false) {
					precioFinal = 4800;
				}
				else {
					if (this.diametro == 30 && this.ingredientesEspeciales == true) {
						precioFinal = 4800 + ADICIONAL_INGREDIENTES_ESPECIALES_30;
					}
					else {
						if(this.diametro == 40 && this.ingredientesEspeciales == false) {
							precioFinal = 5500;
						}
						else {
							if(this.diametro == 40 && this.ingredientesEspeciales == true) {
								precioFinal = 5500 + ADICIONAL_INGREDIENTES_ESPECIALES_40;
							}
						}
					}
				}
			}
		}
		
		return precioFinal;
	}
	public void calcularArea() {
		float area, radio;
		
		radio = this.diametro / 2;
		area = (float) Math.pow(Math.PI * radio, 2);
		this.area = area;
	}

	// **** GETTERS & SETTERS ****
	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}

	public int getADICIONAL_INGREDIENTES_ESPECIALES_20() {
		return ADICIONAL_INGREDIENTES_ESPECIALES_20;
	}

	public int getADICIONAL_INGREDIENTES_ESPECIALES_30() {
		return ADICIONAL_INGREDIENTES_ESPECIALES_30;
	}

	public int getADICIONAL_INGREDIENTES_ESPECIALES_40() {
		return ADICIONAL_INGREDIENTES_ESPECIALES_40;
	}

}
