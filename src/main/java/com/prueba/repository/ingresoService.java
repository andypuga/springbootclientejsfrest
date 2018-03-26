package com.prueba.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.prueba.data.Ingresos;

public class ingresoService implements IIngreso{
@Autowired
IngresoRepo dao;
	@Override
	public List<Ingresos> findAll() {
		// TODO Auto-generated method stub
		return (List<Ingresos>) dao.findAll();
	}

	@Override
	public Ingresos findOne(Integer id) {
		// TODO Auto-generated method stub
		return dao.findOne(id);
	}

	@Override
	public void save(Ingresos dep) {
		// TODO Auto-generated method stub
		dao.save(dep);	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

}
