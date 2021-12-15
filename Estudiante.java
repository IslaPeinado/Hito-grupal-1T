package com.GyS;

public class Estudiante {
	//atributos
	public String nombre;
	public String apellido;
	public String idalumno;
	
	//Constructor
	public Estudiante(String nombre, String apellido, String idalumno) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.idalumno = idalumno;
	}
	//getter y setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(String idalumno) {
		this.idalumno = idalumno;
	}
	
}

