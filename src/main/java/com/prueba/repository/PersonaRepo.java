package com.prueba.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.data.Persona;
@Repository
public interface PersonaRepo extends CrudRepository<Persona	, Integer>{

}
