package com.proyecto.registro.servicios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.proyecto.registro.modelo.Proyecto;


public interface RepoProyecto extends CrudRepository<Proyecto, Integer>{
	
	
	
	@Query(value = "SELECT * FROM proyecto", nativeQuery = true)
	ArrayList<Proyecto> todos();

}
