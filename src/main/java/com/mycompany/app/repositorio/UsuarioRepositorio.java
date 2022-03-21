package com.mycompany.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.app.modelo.Usuario;
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{
	
}
