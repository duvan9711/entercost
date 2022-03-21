package com.mycompany.app.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.app.dao.InventarioServicio;
import com.mycompany.app.modelo.Inventario;
import com.mycompany.app.repositorio.InventarioRepositorio;

@Service
public class InventarioImp implements InventarioServicio{
	@Autowired
	private InventarioRepositorio inventarioRepositorio;
	@Override
	public List<Inventario> Buscartodos() {
		
		return inventarioRepositorio.findAll();
	}

	@Override
	public void crearInventario(Inventario inventario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarInventario(Inventario inventario) {
		// TODO Auto-generated method stub
		
	}
	

}
