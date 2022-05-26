package com.proyecto.registro.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.proyecto.registro.modelo.Proyecto;





@Service
public class ServicioProyecto implements IproyectoService{
	
	
	@Autowired
	private RepoProyecto repoProyecto;
	
	private String Mensaje;

	public String getMensaje() {
		return Mensaje;
	}

	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}
	
	public boolean agregar(Proyecto proyecto) {
		try {
			repoProyecto.save(proyecto);
			this.Mensaje = "Proyecto registrado con exito.";
			return true;
		}catch(Exception e) {
			this.Mensaje = "Error al registrar el Proyecto";
			return false;
		}
	}
	
	public Iterable<Proyecto> verTodos(){
		try {
			this.Mensaje="";
			return repoProyecto.findAll();
		}catch(Exception e) {
			this.Mensaje = e.getMessage();
			return null;
		}
	}
	
	public Proyecto buscar(int id) {
		try {
			this.Mensaje="";
			Proyecto proyecto = repoProyecto.findById(id).get();
			return proyecto == null ? new Proyecto() : proyecto;
		}catch(Exception e) {
			this.Mensaje = e.getMessage();
			return null;
		}
	}

	@Override
	public List<Proyecto> listar() {
		
		return (List<Proyecto>)repoProyecto.findAll();
	}

	@Override
	public Optional<Proyecto> listarId(int id) {
		
		return repoProyecto.findById(id);
	}

	@Override
	public int save(Proyecto p) {
		int res=0;
		Proyecto proyecto=repoProyecto.save(p);
		if(!proyecto.equals(null)) {
			res=1;
		}
		return res;
	}
	
	

}
