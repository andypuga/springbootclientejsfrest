package com.prueba.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.prueba.data.Cuenta;

public class CuentaService implements ICuenta{
@Autowired 
CuentaRepo dao;
	@Override
	public List<Cuenta> findAll() {
		// TODO Auto-generated method stub
		return (List<Cuenta>) dao.findAll();
	}

	@Override
	public Cuenta findOne(Integer id) {
		// TODO Auto-generated method stub
		return dao.findOne(id);
	}

	@Override
	public void save(Cuenta cuen) {
		// TODO Auto-generated method stub
		dao.save(cuen);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

}
