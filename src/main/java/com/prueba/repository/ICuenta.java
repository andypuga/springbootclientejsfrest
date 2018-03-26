package com.prueba.repository;

import java.util.List;

import com.prueba.data.Cuenta;


public interface ICuenta {
	public List<Cuenta> findAll();
	public Cuenta findOne(Integer id);
	public void save(Cuenta cuen);
	public void delete(Integer id);
		
}
