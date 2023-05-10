package com.libreria.demo.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRESTAMO")
public class Prestamo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "IDPRESTAMO")
	private Long idPrestamo;

	@Column(name = "IDUSUARIO")
	private Long idUsuario;

	@Column(name = "IDLIBRO")
	private Long idLibro;

	public Prestamo() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(Long idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
	}

}
