package com.variables;

public class Variable2 {
	//atributos
	protected boolean decision;
	protected int entero;
	protected double fraccion;
	protected float decimal;
	protected char carac;
	protected String cadena;
	//constructor
	protected Variable2(boolean decision, int entero, double fraccion, double d, char carac, String cadena) {
		super();
		this.decision = decision;
		this.entero = entero;
		this.fraccion = fraccion;
		this.decimal = d;
		this.carac = carac;
		this.cadena = cadena;
	}
	//getter y setter
	protected boolean isDecision() {
		return decision;
	}
	protected void setDecision(boolean decision) {
		this.decision = decision;
	}
	protected int getEntero() {
		return entero;
	}
	protected void setEntero(int entero) {
		this.entero = entero;
	}
	protected double getFraccion() {
		return fraccion;
	}
	protected void setFraccion(double fraccion) {
		this.fraccion = fraccion;
	}
	protected float getDecimal() {
		return decimal;
	}
	protected void setDecimal(float decimal) {
		this.decimal = decimal;
	}
	protected char getCarac() {
		return carac;
	}
	protected void setCarac(char carac) {
		this.carac = carac;
	}
	protected String getCadena() {
		return cadena;
	}
	protected void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
}
