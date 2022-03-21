package com.mycompany.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.app.modelo.Proyecto;
@Repository
public interface ProyectoRepositorio extends JpaRepository<Proyecto, Integer>{

}
