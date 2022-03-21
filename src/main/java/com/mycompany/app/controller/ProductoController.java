package com.mycompany.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.mycompany.app.daoImp.ProductoImp;
import com.mycompany.app.modelo.Producto;


@Controller
@RequestMapping
public class ProductoController {
	
	@Autowired
	ProductoImp productoimp;
	@GetMapping("/tablaproducto")
	public String Listar(Model model) {
		List<Producto>listProducto = this.productoimp.Buscartodos();
		model.addAttribute("listProducto",listProducto);
		return "tablaproducto";
	}
}
