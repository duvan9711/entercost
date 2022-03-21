package com.mycompany.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.app.daoImp.PagoImp;
import com.mycompany.app.modelo.Pago;

@Controller
@RequestMapping
public class PagoController {

	@Autowired
	PagoImp pagoimp;
	@GetMapping("/tablapago")
	public String Listar(Model model) {
		List<Pago>listPago = this.pagoimp.listarPago();
		model.addAttribute("listPago",listPago);
		return "tablapagos";
	}
}