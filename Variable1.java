package com.variables;

public class Variable1 {
	//atributos
	public boolean decision;
	public int entero;
	public double fraccion;
	public float decimal;
	public char carac;
	public String cadena;
	//constructor
	public Variable1(boolean decision, int entero, double fraccion, double d, char carac, String cadena) {
		super();
		this.decision = decision;
		this.entero = entero;
		this.fraccion = fraccion;
		this.decimal = d;
		this.carac = carac;
		this.cadena = cadena;
	}
	//getter/setter
	public boolean isDecision() {
		return decision;
	}
	public void setDecision(boolean decision) {
		this.decision = decision;
	}
	public int getEntero() {
		return entero;
	}
	public void setEntero(int entero) {
		this.entero = entero;
	}
	public double getFraccion() {
		return fraccion;
	}
	public void setFraccion(double fraccion) {
		this.fraccion = fraccion;
	}
	public float getDecimal() {
		return decimal;
	}
	public void setDecimal(float decimal) {
		this.decimal = decimal;
	}
	public char getCarac() {
		return carac;
	}
	public void setCarac(char carac) {
		this.carac = carac;
	}
	public String getCadena() {
		return cadena;
	}
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
}

