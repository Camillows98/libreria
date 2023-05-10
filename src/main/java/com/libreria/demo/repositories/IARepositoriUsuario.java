package com.libreria.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libreria.demo.entities.Usuario;

@Repository
public interface IARepositoriUsuario extends JpaRepository<Usuario, Long>{
	
	//SELECT p FROM Person p WHERE p.salary > :maxValue
	//select * from USUARIO where cedula=1047360993
//	@Query(value = "SELECT u FROM Usuario u WHERE u.cedula = maxValue")
//	public List<Usuario> cedula(Long cedula);
	
	public abstract ArrayList<Usuario> findByCedula(Long cedula);

}
