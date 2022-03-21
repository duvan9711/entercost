package com.mycompany.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.app.daoImp.InventarioImp;
import com.mycompany.app.modelo.Inventario;

@Controller
@RequestMapping
public class InventarioController {
	
	@Autowired
	InventarioImp inventarioImp;
	@GetMapping("/tablainventario")
	public String Listar(Model model) {
		List<Inventario> listInventario = this.inventarioImp.Buscartodos();
		model.addAttribute("listInventario", listInventario);
		return "tablainventario";
	}

}
