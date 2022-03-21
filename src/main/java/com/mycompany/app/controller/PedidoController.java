package com.mycompany.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mycompany.app.daoImp.PedidoImp;
import com.mycompany.app.modelo.Pedido;

@Controller
@RequestMapping
public class PedidoController {
	
	@Autowired
	PedidoImp pedidoImp;
	@GetMapping("/tablapedido")
	public String Listar(Model model) {
		List<Pedido> listPedido = this.pedidoImp.Buscartodos();
		model.addAttribute("listPedido", listPedido);
		return "tablapedido";
	}
}
