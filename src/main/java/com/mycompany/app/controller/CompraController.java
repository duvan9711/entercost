package com.mycompany.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.app.daoImp.CompraImp;
import com.mycompany.app.modelo.Compra;


@Controller
@RequestMapping
public class CompraController {
	
		@Autowired
		CompraImp compraImp;
		@GetMapping("/tablacompra")
		public String Listar(Model model) {
			List<Compra> listCompra = this.compraImp.Buscartodos();
			model.addAttribute("listCompra", listCompra);
			return "tablacompras";
		}

}
