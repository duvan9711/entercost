package com.mycompany.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.mycompany.app.daoImp.ProyectoImp;
import com.mycompany.app.modelo.Proyecto;

@Controller
@RequestMapping
public class ProyectoController {

	@Autowired
	ProyectoImp proyectoImp;
	@GetMapping("/tablaproyecto")
	public String Listar(Model model) {
		List<Proyecto> listProyecto = this.proyectoImp.Buscartodos();
		model.addAttribute("listProyecto", listProyecto);
		return "tablaproyecto";
	}
}
