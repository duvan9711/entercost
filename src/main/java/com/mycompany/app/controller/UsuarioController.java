package com.mycompany.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.app.daoImp.UsuarioImp;
import com.mycompany.app.modelo.Usuario;

@Controller
@RequestMapping
public class UsuarioController {

	@Autowired
	UsuarioImp usuarioImp;
	@GetMapping("/listUsuario")
	public String Listar(Model model) {
		List<Usuario> listUsuario = this.usuarioImp.BuscarTodos();
		model.addAttribute("listUsuario", listUsuario);
		return "";
	}
}
