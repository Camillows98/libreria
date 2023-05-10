package com.libreria.demo.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LIBRO")
public class Libro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "IDLIBRO")
	private Long idLibro;

	@Column(name = "NOMBRE")
	private String Nombre;

	@Column(name = "AUTOR")
	private String autor;

	@Column(name = "NUMEROPAGINAS")
	private Long NumeroPaginas;

	@Column(name = "DISPONIBILIDAD")
	private Boolean disponibilidad;

	public Libro() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Long getNumeroPaginas() {
		return NumeroPaginas;
	}

	public void setNumeroPaginas(Long numeroPaginas) {
		NumeroPaginas = numeroPaginas;
	}

	public Boolean getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

}
