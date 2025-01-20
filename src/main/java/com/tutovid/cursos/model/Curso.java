package com.tutovid.cursos.model;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cursos")
@Data
public class Curso {
	
	@Id
    private Long id;
    private String nombre;
    private Double precio;
    

    public Curso(Long id, String nombre, Double precio) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}
   
}

