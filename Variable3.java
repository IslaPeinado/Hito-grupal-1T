package com.variables;

class Variable3 {
	//atributos
	private boolean decision;
	private int entero;
	private double fraccion;
	private float decimal;
	private char carac;
	private String cadena;
	//constructor
	private Variable3(boolean decision, int entero, double fraccion, float decimal, char carac, String cadena) {
		super();
		this.decision = decision;
		this.entero = entero;
		this.fraccion = fraccion;
		this.decimal = decimal;
		this.carac = carac;
		this.cadena = cadena;
	}
	//getter/setter
	@SuppressWarnings("unused")
	private boolean isDecision() {
		return decision;
	}
	@SuppressWarnings("unused")
	private void setDecision(boolean decision) {
		this.decision = decision;
	}
	@SuppressWarnings("unused")
	private int getEntero() {
		return entero;
	}
	@SuppressWarnings("unused")
	private void setEntero(int entero) {
		this.entero = entero;
	}
	@SuppressWarnings("unused")
	private double getFraccion() {
		return fraccion;
	}
	@SuppressWarnings("unused")
	private void setFraccion(double fraccion) {
		this.fraccion = fraccion;
	}
	@SuppressWarnings("unused")
	private float getDecimal() {
		return decimal;
	}
	@SuppressWarnings("unused")
	private void setDecimal(float decimal) {
		this.decimal = decimal;
	}
	@SuppressWarnings("unused")
	private char getCarac() {
		return carac;
	}
	@SuppressWarnings("unused")
	private void setCarac(char carac) {
		this.carac = carac;
	}
	@SuppressWarnings("unused")
	private String getCadena() {
		return cadena;
	}
	@SuppressWarnings("unused")
	private void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
}