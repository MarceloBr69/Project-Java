package com.ProyectoClass;

public class Project {
	private String nombre;
	private String descripcion;
	private double initialCost; //Extra challenge
	
	//Constructors
	public Project() {
	}
	public Project(String name) {
		nombre = name;
	}
	public Project(String name, String description) {
	    this.nombre = name;
	    this.descripcion = description;
	}

	
	//Show in the console:
	public  void elevatorPitch() {
		System.out.println(nombre);
		System.out.println(nombre + ": " + descripcion);
		
	}
	
	//Getters and Setters:
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getInitialCost() {
		return initialCost;
	}
	public void setInitialCost(double initialCost) {
		this.initialCost = initialCost;
	}	

}
