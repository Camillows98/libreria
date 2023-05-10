package com.libreria.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libreria.demo.entities.Prestamo;

@Repository
public interface IARepositoriPrestamo extends JpaRepository<Prestamo, Long>{
	
	public abstract ArrayList<Prestamo> findByIdPrestamo(Long idPrestamo);

}
