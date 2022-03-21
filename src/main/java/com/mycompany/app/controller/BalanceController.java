package com.mycompany.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.app.daoImp.BalanceImp;

import com.mycompany.app.modelo.Balance;


@Controller
@RequestMapping
public class BalanceController {
	@Autowired
	BalanceImp balanceImp;
	@GetMapping("/tablabalance")
	public String Listar(Model model) {
		List<Balance> listBalance = this.balanceImp.Buscartodos();
		model.addAttribute("listBalance", listBalance);
		return "tablabalance";
	}
}
