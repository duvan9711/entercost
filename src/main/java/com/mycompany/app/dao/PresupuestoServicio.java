package com.mycompany.app.dao;

import java.util.List;

import com.mycompany.app.modelo.Presupuesto;

public interface PresupuestoServicio {
	public List<Presupuesto> Buscartodos();
	
	public void crearPresupuesto(Presupuesto presupuesto);
	
	public void actualizarPresupuesto(Presupuesto presupuesto);
}
