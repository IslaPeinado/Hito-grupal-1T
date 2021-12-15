package com.GyS2;

import com.GyS.Estudiante;

public class Principal {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Estudiante estudiante1=new Estudiante("Diego","Gómez","1");
			Estudiante estudiante2=new Estudiante("Sergio","Camino","2");
			Estudiante estudiante3=new Estudiante("Isla","Peinado","3");
			Estudiante estudiante4=new Estudiante("Astrid","Cruces","4");
			
			System.out.println("Ficha del alumno 1");
			System.out.println(estudiante1.getNombre());
			System.out.println(estudiante1.getApellido());
			System.out.println(estudiante1.getIdalumno());
			System.out.println("");
			System.out.println("Ficha del alumno 2");
			System.out.println(estudiante2.getNombre());
			System.out.println(estudiante2.getApellido());
			System.out.println(estudiante2.getIdalumno());
			System.out.println("");
			System.out.println("Ficha del alumno 3");
			System.out.println(estudiante3.getNombre());
			System.out.println(estudiante3.getApellido());
			System.out.println(estudiante3.getIdalumno());
			System.out.println("");
			System.out.println("Ficha del alumno 4");
			System.out.println(estudiante4.getNombre());
			System.out.println(estudiante4.getApellido());
			System.out.println(estudiante4.getIdalumno());
	}

}
