package com.prueba.repository;

import java.util.List;


import com.prueba.data.Egresos;


public interface IEgreso {
	public List<Egresos> findAll();
	public Egresos findOne(Integer id);
	public void save(Egresos dep);
	public void delete(Integer id);
}
