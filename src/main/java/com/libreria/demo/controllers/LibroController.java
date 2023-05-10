package com.libreria.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.demo.entities.Libro;
import com.libreria.demo.services.LibroService;

@RestController
@CrossOrigin
@RequestMapping("/libro")
public class LibroController {
	
	@Autowired
	private LibroService libroService;
	
	@PostMapping("/saveLibro")
	public Libro saveLibro(@RequestBody Libro libro) {
		return libroService.saveLibro(libro);
	}

	@GetMapping("/listLibros")
	public List<Libro> listLibros() {
		return libroService.listLibros();
	}

	@GetMapping("/queryid")
	public ArrayList<Libro> obtenerporId(@RequestParam("id") Long id) {
		return this.libroService.obtenerporId(id);
	}

}
