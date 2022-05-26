package com.proyecto.registro.servicios;

import java.util.List;
import java.util.Optional;

import com.proyecto.registro.modelo.Proyecto;

public interface IproyectoService {
	public List<Proyecto>listar();
	public Optional<Proyecto>listarId(int id);
	public int save(Proyecto p);

}
