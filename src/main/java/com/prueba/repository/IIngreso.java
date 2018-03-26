package com.prueba.repository;

import java.util.List;

import com.prueba.data.Ingresos;

public interface IIngreso {
	public List<Ingresos> findAll();
	public Ingresos findOne(Integer id);
	public void save(Ingresos dep);
	public void delete(Integer id);
}
