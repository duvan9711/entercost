package com.mycompany.app.dao;

import java.util.List;

import com.mycompany.app.modelo.Usuario;

public interface UsuarioServicio {
	public List<Usuario> BuscarTodos();
	
	public void crearUsuario(Usuario usuario);
		
	public void actualizarUsuario(Usuario usuario);
	
}
