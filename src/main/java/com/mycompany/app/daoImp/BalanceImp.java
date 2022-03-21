package com.mycompany.app.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.app.dao.BalanceServicio;
import com.mycompany.app.modelo.Balance;
import com.mycompany.app.repositorio.BalanceRepositorio;

@Service
public class BalanceImp implements BalanceServicio{
	@Autowired
	private BalanceRepositorio balancerRepositorio;
	@Override
	public List<Balance> Buscartodos() {
		
		return balancerRepositorio.findAll();
	}

	@Override
	public void crearBalance(Balance balance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarBalance(Balance balance) {
		// TODO Auto-generated method stub
		
	}

}
