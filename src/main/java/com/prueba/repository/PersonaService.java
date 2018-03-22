package com.prueba.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.data.Persona;


@Service
public class PersonaService  implements IPersona{
@Autowired
PersonaRepo dao;

@Override
public List<Persona> findAll() {
	List<Persona> personas = (List<Persona>) dao.findAll();
	return personas;
}

@Override
public Persona findOne(Integer id) {
	Persona per = dao.findOne(id);
	return per;
}

@Override
public void save(Persona per) {
	dao.save(per);
	
}

@Override
public void delete(Integer id) {
	dao.delete(id);
	
}

	

	
}
