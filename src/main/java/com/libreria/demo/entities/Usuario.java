package com.libreria.demo.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CEDULA")
	private Long cedula;

	@Column(name = "NOMBRE")
	private String Nombre;

	@Column(name = "NOMBREUSUARIO")
	private String NombreUsuario;

	@Column(name = "PRESTAMO")
	private Boolean Prestamo;

	@Column(name = "IDPRESTAMO")
	private Long idPrestamo;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getNombreUsuario() {
		return NombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}

	public Boolean getPrestamo() {
		return Prestamo;
	}

	public void setPrestamo(Boolean prestamo) {
		Prestamo = prestamo;
	}

	public Long getIPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(Long idLibroPrestamo) {
		this.idPrestamo = idLibroPrestamo;
	}

}
