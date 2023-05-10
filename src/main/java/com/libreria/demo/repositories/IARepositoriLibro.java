package com.libreria.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libreria.demo.entities.Libro;

@Repository
public interface IARepositoriLibro extends JpaRepository<Libro, Long>{
	
	public abstract ArrayList<Libro> findByIdLibro(Long idLibro);

}
