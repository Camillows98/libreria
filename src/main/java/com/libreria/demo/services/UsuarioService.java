package com.libreria.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.demo.entities.Usuario;
import com.libreria.demo.repositories.IARepositoriUsuario;

@Service
public class UsuarioService {

	@Autowired
	private IARepositoriUsuario iaRepositoriUsuario;
	
	public Usuario saveUsuario(Usuario usuario) {
		iaRepositoriUsuario.save(usuario);
		return usuario;
	}
	
	public List<Usuario> listUsuarios(){
		return iaRepositoriUsuario.findAll();
	}
	
	public ArrayList<Usuario> obtenerporCedula(Long cedula) {
        return this.iaRepositoriUsuario.findByCedula(cedula);

    }
}
