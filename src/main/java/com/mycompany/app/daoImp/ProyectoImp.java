package com.mycompany.app.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.app.dao.ProyectoServicio;
import com.mycompany.app.modelo.Proyecto;
import com.mycompany.app.repositorio.ProyectoRepositorio;
@Service
public class ProyectoImp implements ProyectoServicio{
	@Autowired
	private ProyectoRepositorio proyectoRepositorio;
	@Override
	public List<Proyecto> Buscartodos() {
		// TODO Auto-generated method stub
		return proyectoRepositorio.findAll();
	}

	@Override
	public void crearProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		
	}

}
