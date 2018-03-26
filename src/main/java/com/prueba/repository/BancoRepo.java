package com.prueba.repository;

import org.springframework.data.repository.CrudRepository;

import com.prueba.data.Banco;

public interface BancoRepo extends CrudRepository<Banco, Integer>{

}
