package com.proyecto.registro.controladores;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.proyecto.registro.modelo.Proyecto;
import com.proyecto.registro.modelo.Usuario;
import com.proyecto.registro.servicios.IproyectoService;
import com.proyecto.registro.servicios.ServicioProyecto;
import com.proyecto.registro.servicios.ServicioUsuario;





@Controller
public class ProyectoController {
	
	@Autowired
	ServicioUsuario servicioUsuario;
	@Autowired
	ServicioProyecto servicioProyecto;
	
	
	
	@GetMapping("/proyecto/index")
	public String inicio() {
		return "proyecto/index";
	}
	
	@GetMapping("/proyecto/agregar")
	public String agregar(Model modelo) {
		modelo.addAttribute("proyecto", new Proyecto());
		return "proyecto/agregar";
	}
	
	
	
	@PostMapping("/proyecto/agregar")
	public String agregar(Model modelo, @ModelAttribute Proyecto proyecto, HttpSession sesion) {
		int iduser = Integer.parseInt(sesion.getAttribute("iduser").toString());
		Usuario autor = servicioUsuario.buscar(iduser);
		if(autor == null || autor.getId() == 0) 
			modelo.addAttribute("error", servicioUsuario.getMensaje());
		else {
			proyecto.setUsuario(autor);
			if(!servicioProyecto.agregar(proyecto));
				modelo.addAttribute("error", servicioProyecto.getMensaje());
		}
		return "proyecto/agregar";
	}
	
	
	
	@Autowired
	private IproyectoService service;
	@GetMapping("/proyecto/listar")
	public String listar(Model model) {
		List<Proyecto>proyectos=service.listar();
		model.addAttribute("proyecto", proyectos);
		return "proyecto/listar";
	}
	
	@GetMapping("/new")
	public String agregarE(Model model) {
		model.addAttribute("proyecto", new Proyecto());
		return "proyecto/editar";
	}
	
	@PostMapping("/save")
	public String save(@Validated Proyecto p, Model model) {
		service.save(p);
		return "redirect:/proyecto/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Proyecto>proyecto=service.listarId(id);
		model.addAttribute("proyecto", proyecto);
		return "proyecto/editar";
	}

}
