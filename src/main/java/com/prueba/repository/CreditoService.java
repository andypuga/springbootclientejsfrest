package com.prueba.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.prueba.data.Credito;

public class CreditoService implements ICredito{
@Autowired
CreditoRepo dao;
	@Override
	public List<Credito> findAll() {
		// TODO Auto-generated method stub
		return (List<Credito>) dao.findAll();
	}

	@Override
	public Credito findOne(Integer id) {
		// TODO Auto-generated method stub
		return dao.findOne(id);
	}

	@Override
	public void save(Credito cred) {
		// TODO Auto-generated method stub
	dao.save(cred);	
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
	}

}
