package com.prueba.repository;

import java.util.List;

import com.prueba.data.TipoValor;

public interface ITipoValor {
	public List<TipoValor> findAll();
	public TipoValor findOne(Integer id);
	public void save(TipoValor dep);
	public void delete(Integer id);
}
