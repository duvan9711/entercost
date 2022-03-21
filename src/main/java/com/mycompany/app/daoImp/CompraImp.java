package com.mycompany.app.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.app.dao.CompraServicio;
import com.mycompany.app.modelo.Compra;
import com.mycompany.app.repositorio.CompraRepositorio;
@Service
public class CompraImp implements CompraServicio{
	@Autowired
	private CompraRepositorio compraRepositorio;
	@Override
	public List<Compra> Buscartodos() {	
		
		return compraRepositorio.findAll();
	}

	@Override
	public void crearCompra(Compra compra) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarCompra(Compra compra) {
		// TODO Auto-generated method stub
	}
		
}
