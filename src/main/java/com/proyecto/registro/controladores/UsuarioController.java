package com.proyecto.registro.controladores;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.registro.modelo.Usuario;
import com.proyecto.registro.servicios.*;

@Controller
public class UsuarioController {
	
	@Autowired
	ServicioUsuario servicioUsuario;
	
	@GetMapping(path= {"/usuario/validar", "/"})
	public String validar()
	{
		return "usuario/validar";
	}
	
	@PostMapping("/usuario/validar")
	public String agregar(@RequestParam("username")String numerocontrol, @RequestParam("password") String clave,
			Model modelo)
	{
		
			 return "redirect:/proyecto/index";
	}
	
	@GetMapping("/usuario/agregar")
	public String agregar(Model model)
	{
		model.addAttribute("usuario", new Usuario());
		return "usuario/agregar";
	}
	
	@PostMapping("/usuario/agregar")
	public String agregar(Model modelo, @ModelAttribute Usuario user,
			@RequestParam("clave") String clave, HttpSession sesion)
	{
		boolean res= servicioUsuario.agregar(user, clave, sesion);
		if(res)
		{
			return "redirect:/proyecto/index";
		}
		modelo.addAttribute("error", servicioUsuario.getMensaje());
		return "/usuario/agregar";
	}
	
	@GetMapping("/usuario/salir")
	public String salir(HttpSession sesion) {
		SecurityContextHolder.clearContext();
		sesion.invalidate();
		return "redirect:/";
	}

}
