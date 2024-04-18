package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	String nombre;
	Calendar fechaNacimiento = Calendar.getInstance();
	
	public Persona(String nombre, Calendar fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	public int calcularEdad() {
		int edad = 0;
		int anio;
		
		anio = this.fechaNacimiento.get(Calendar.YEAR);
		edad = 2024 - anio;
		return edad;
	}
	
	public String calcularSigno() {
		int mes, dia;
		String signo = "";
		
		mes = this.fechaNacimiento.get(Calendar.MONTH);
		dia = this.fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		
		if (dia >= 21 && mes == 2 || dia <= 19 && mes == 3) {
			signo = "Aries";
		}
		else {
			if (dia >= 2 && mes == 3 || dia <= 20 && mes == 4) {
				signo = "Tauro";
			}
			else {
				if (dia >= 21 && mes == 4 || dia <= 20 && mes == 5) {
					signo = "Geminis";
				}
				else {
					if (dia >= 21 && mes == 5 || dia <= 22 && mes == 6) {
						signo = "Cancer";
					}
					else {
						if (dia >= 23 && mes == 6 || dia <= 22 && mes == 7) {
							signo = "Leo";
						}
						else {
							if (dia >= 23 && mes == 7 || dia <= 22 && mes == 8) {
								signo = "Virgo";
							}
							else {
								if (dia >= 23 && mes == 8 || dia <= 22 && mes == 9) {
									signo = "Libra";
								}
								else {
									if (dia >= 23 && mes == 9 || dia <= 21 && mes == 10) {
										signo = "Escorpio";
									}
									else {
										if (dia >= 22 && mes == 10 || dia <= 21 && mes == 11) {
											signo = "Sagitario";
										}
										else {
											if (dia >= 22 && mes == 11 || dia <= 19 && mes == 0) {
												signo = "Capricornio";
											}
											else {
												if (dia >= 20 && mes == 0 || dia <= 18 && mes == 1) {
													signo = "Acuario";
												}
												else {
													if (dia >= 19 && mes == 1 || dia <= 20 && mes == 2) {
														signo = "Piscis";
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		return signo;
	}
	
	public String calcularEstacionAnio() {
		String estacion = "";
		int dia, mes;
		
		dia = this.fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		mes = this.fechaNacimiento.get(Calendar.MONTH);
		
		if ((dia >= 21 && mes == 11) || (dia <= 19 && mes <= 2)) {
			estacion = "Verano";
		}
		else {
			if ((dia >= 20 && mes == 2) || (dia <= 20 && mes <= 5)) {
				estacion = "Otoño";
			}
			else {
				if ((dia >= 21 && mes == 5) || (dia <= 20 && mes <= 8)) {
					estacion = "Invierno";
				}
				else {
					if ((dia >= 21 && mes == 8) || (dia <= 20 && mes <= 11)) {
						estacion = "Primavera";
					}
				}
			}
		}
		
		return estacion;
	}
	
}
