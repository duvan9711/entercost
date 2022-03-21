package com.mycompany.app.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.app.dao.UsuarioServicio;
import com.mycompany.app.modelo.Usuario;
import com.mycompany.app.repositorio.UsuarioRepositorio;

@Service

public class UsuarioImp implements UsuarioServicio{
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	@Override
	public List<Usuario> BuscarTodos() {
		
		return usuarioRepositorio.findAll();
	}

	@Override
	public void crearUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

}
