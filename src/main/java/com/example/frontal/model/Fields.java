package com.example.frontal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // esto significa que representa una entidad que estará mapeando la base de datos
public class Fields {
	
	@Id // clave primaria de la base de datos
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrementado
	private Long id;
	
	private String name;
	private String city;
	private String email;
	private String message;
	
	// constructor
	public Fields() {
		/*
		 * JPA lo necesita para poder crear instancias de la entidad cuando carga los datos de la base de datos.
		 * Este debe ser un constructor público y sin argumentos.
		 * 
		 * Instancia: Cuando creas un objeto real basado en esa clase, a ese objeto lo llamamos una instancia.
		 */  
		
	}
	public Fields(String name, String city, String email, String message) {
		this.name = name;
		this.city = city;
		this.email = email;
		this.message = message;
	}
	
	// getter y setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
