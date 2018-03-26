package com.prueba.repository;

import java.util.List;

import com.prueba.data.Banco;


public interface IBanco {
	public List<Banco> findAll();
	public Banco findOne(Integer id);
	public void save(Banco ban);
	public void delete(Integer id);
		
}
