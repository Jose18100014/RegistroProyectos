package com.proyecto.registro.servicios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.proyecto.registro.modelo.Usuario;





public interface RepoUsuario extends CrudRepository<Usuario, Integer>{
	@Query(value= "SELECT * FROM usuario WHERE numerocontrol = ?1 AND claveacceso = ?2", nativeQuery= true)
	Usuario validar(String numerocontrol, byte[] claveacceso);

}
