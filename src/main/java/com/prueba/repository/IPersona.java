package com.prueba.repository;

import java.util.List;

import com.prueba.data.Persona;

public interface IPersona {
	public List<Persona> findAll();
	public Persona findOne(Integer id);
	public void save(Persona per);
	public void delete(Integer id);
		
}
