package com.prueba.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.prueba.data.Banco;

public class BancoService implements IBanco{
@Autowired
BancoRepo dao;
	@Override
	public List<Banco> findAll() {
		// TODO Auto-generated method stub
		return (List<Banco>) dao.findAll();
	}

	@Override
	public Banco findOne(Integer id) {
		// TODO Auto-generated method stub
		return dao.findOne(id);
	}

	@Override
	public void save(Banco ban) {
		dao.save(ban);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
	}

}
