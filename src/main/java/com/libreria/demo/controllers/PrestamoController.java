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

import com.libreria.demo.entities.Prestamo;
import com.libreria.demo.services.PrestamoService;

@RestController
@CrossOrigin
@RequestMapping("/prestamo")
public class PrestamoController {

	@Autowired
	private PrestamoService prestamoService;
	
	@PostMapping("/savePrestamo")
	public Prestamo savePrestamo(@RequestBody Prestamo prestamo) {
		return prestamoService.savePrestamo(prestamo);
	}

	@GetMapping("/listPrestamos")
	public List<Prestamo> listPrestamos() {
		return prestamoService.listPrestamos();
	}

	@GetMapping("/queryid")
	public ArrayList<Prestamo> obtenerporId(@RequestParam("id") Long id) {
		return this.prestamoService.obtenerporId(id);
	}
}
