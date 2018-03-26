package com.prueba.repository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.prueba.data.TipoValor;

public class TipoValorService implements ITipoValor{
@Autowired
TipoValoRepo dao;
	@Override
	public List<TipoValor> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoValor>) dao.findAll();
	}

	@Override
	public TipoValor findOne(Integer id) {
		// TODO Auto-generated method stub
		return dao.findOne(id);
	}

	@Override
	public void save(TipoValor dep) {
		// TODO Auto-generated method stub
		dao.save(dep);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

}
