package com.libreria.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.demo.entities.Usuario;
import com.libreria.demo.services.UsuarioService;

@RestController
@CrossOrigin
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping("/saveUsuario")
	public Usuario saveUsuario(@RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}

	@GetMapping("/listUsuarios")
	public List<Usuario> listUsuarios() {
		return usuarioService.listUsuarios();
	}

	@GetMapping("/querycedu")
	public ArrayList<Usuario> obtenerporCedula(@RequestParam("cedula") Long cedula) {
		return this.usuarioService.obtenerporCedula(cedula);
	}

}
