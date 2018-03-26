package com.prueba.repository;

import java.util.List;

import com.prueba.data.Credito;


public interface ICredito {
	public List<Credito> findAll();
	public Credito findOne(Integer id);
	public void save(Credito cred);
	public void delete(Integer id);
		
}
