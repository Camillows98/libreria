package com.libreria.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.demo.entities.Prestamo;
import com.libreria.demo.repositories.IARepositoriPrestamo;

@Service
public class PrestamoService {
	
	@Autowired 
	private IARepositoriPrestamo iaRepositoriPrestamo;
	
	public Prestamo savePrestamo(Prestamo prestamo) {
		iaRepositoriPrestamo.save(prestamo);
		return prestamo;
	}
	
	public List<Prestamo> listPrestamos(){
		return iaRepositoriPrestamo.findAll();
	}
	
	public ArrayList<Prestamo> obtenerporId(Long id) {
        return this.iaRepositoriPrestamo.findByIdPrestamo(id);

    }

}
