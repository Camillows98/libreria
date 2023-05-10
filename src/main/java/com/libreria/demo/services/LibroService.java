package com.libreria.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.demo.entities.Libro;
import com.libreria.demo.repositories.IARepositoriLibro;

@Service
public class LibroService {
	
	@Autowired
	private IARepositoriLibro iaRepositoriLibro;
	
	public Libro saveLibro(Libro libro) {
		iaRepositoriLibro.save(libro);
		return libro;
	}
	
	public List<Libro> listLibros(){
		return iaRepositoriLibro.findAll();
	}
	
	public ArrayList<Libro> obtenerporId(Long id) {
        return this.iaRepositoriLibro.findByIdLibro(id);

    }

}
