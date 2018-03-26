package com.prueba.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.prueba.data.Deposito;

public class DepositoService  implements IDeposito{
@Autowired
DepositoRepo dao;

	@Override
	public List<Deposito> findAll() {
		// TODO Auto-generated method stub
		return (List<Deposito>) dao.findAll();
	}

	@Override
	public Deposito findOne(Integer id) {
		// TODO Auto-generated method stub
		return dao.findOne(id);
	}

	@Override
	public void save(Deposito dep) {
		// TODO Auto-generated method stub
		dao.save(dep);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

}
