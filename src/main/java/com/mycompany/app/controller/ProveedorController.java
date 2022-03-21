package com.mycompany.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.app.daoImp.ProveedorImp;
import com.mycompany.app.modelo.Proveedor;


@Controller
@RequestMapping
public class ProveedorController {
	
	@Autowired
	ProveedorImp proveedorImp;
	@GetMapping("/tablaproveedor")
	public String Listar(Model model) {
		List<Proveedor> listProveedor = this.proveedorImp.Buscar();
		model.addAttribute("listProveedor", listProveedor);
		return "tablaproveedor";
	}
	
	@GetMapping("/regproveedor")
    public String regproveedor (Model model){
		model.addAttribute("proveedor",new Proveedor());
        return "regproveedor";  
     }
	
	@PostMapping("/guardarProveedor")
    public String guardarProveedor(@Valid Proveedor proveedor, Model model){
        proveedorImp.crearProveedor(proveedor);
        return "redirect:/tablaproveedor";
    }

}
