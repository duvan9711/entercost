package com.mycompany.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.app.daoImp.PresupuestoImp;
import com.mycompany.app.modelo.Presupuesto;

@Controller
@RequestMapping
public class PresupuestoController {
	@Autowired
	PresupuestoImp presupuestoImp;
	@GetMapping("/tablapresupuesto")
	public String Listar(Model model) {
		List<Presupuesto> listPresupuesto = this.presupuestoImp.Buscartodos();
		model.addAttribute("listPresupuesto",listPresupuesto);
		return "tablapresupuesto";
	}
	
	
}
