package com.prueba.repository;

import java.util.List;

import com.prueba.data.Deposito;


public interface IDeposito {
	public List<Deposito> findAll();
	public Deposito findOne(Integer id);
	public void save(Deposito dep);
	public void delete(Integer id);
		
}
