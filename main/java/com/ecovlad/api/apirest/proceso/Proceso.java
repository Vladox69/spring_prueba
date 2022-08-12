package com.ecovlad.api.apirest.proceso;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="procesos")
public class Proceso {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private Integer id;

@Column(name="descripcion")
private String descripcion;

@Column(name="tipo")
private String tipo;

public Proceso() {
	// TODO Auto-generated constructor stub
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

@Override
public String toString() {
	return "Proceso [id=" + id + ", descripcion=" + descripcion + ", tipo=" + tipo + "]";
}



}
