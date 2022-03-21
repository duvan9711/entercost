package com.mycompany.app.dao;

import java.util.List;

import com.mycompany.app.modelo.Proveedor;


public interface ProveedorServicio {
	public List<Proveedor> Buscar();
	
	void crearProveedor(Proveedor proveedor);

	void actualizarProveedor(Proveedor proveedor);

}
