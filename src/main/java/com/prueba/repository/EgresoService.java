package com.prueba.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.prueba.data.Egresos;

public class EgresoService  implements IEgreso{
@Autowired
EgresoRepo dao;
	@Override
	public List<Egresos> findAll() {
		// TODO Auto-generated method stub
		return (List<Egresos>) dao.findAll();
	}

	@Override
	public Egresos findOne(Integer id) {
		// TODO Auto-generated method stub
		return dao.findOne(id);
	}

	@Override
	public void save(Egresos dep) {
		// TODO Auto-generated method stub
		dao.save(dep);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

}
