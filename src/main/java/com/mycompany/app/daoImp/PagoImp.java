package com.mycompany.app.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.app.dao.PagoServicio;
import com.mycompany.app.modelo.Pago;
import com.mycompany.app.repositorio.PagoRepositorio;

@Service
public class PagoImp implements PagoServicio {

	@Autowired
	private PagoRepositorio pagoRepositorio;
	@Override
	public List<Pago> listarPago() {
		// TODO Auto-generated method stub
		return pagoRepositorio.findAll();
	}

	@Override
	public void crearPago(Pago pago) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarPago(Pago pago) {
		// TODO Auto-generated method stub
		
	}
}
