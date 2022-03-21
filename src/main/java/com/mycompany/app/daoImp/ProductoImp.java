package com.mycompany.app.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.app.dao.ProductoServicio;
import com.mycompany.app.modelo.Producto;
import com.mycompany.app.repositorio.ProductoRepositorio;

@Service
public class ProductoImp implements ProductoServicio{
	@Autowired
	private ProductoRepositorio productoRepositorio;
	@Override
	public List<Producto> Buscartodos() {
		
		return productoRepositorio.findAll();
	}

	@Override
	public void crearProducto(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarProducto(Producto producto) {
		// TODO Auto-generated method stub
		
	}

}
