package com.prueba.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.data.TipoValor;
import com.prueba.repository.ITipoValor;
@RestController("/tipovalor")
public class TipoValorRest {
	@Autowired
	ITipoValor tiva;
	@RequestMapping("/lista")
	public List<TipoValor>  allCreditos() {
		return tiva.findAll();
	}
	@RequestMapping(value="/uno/{id}",method=RequestMethod.GET)
	public TipoValor oneingreso( @PathVariable Integer id) {
		return tiva.findOne(id);
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void saveBanco(@RequestBody TipoValor tipoValor ){
	    tiva.save(tipoValor);  
	}
	@RequestMapping(value = "/actualizar/{id}", method = RequestMethod.PUT)
	public void updatebanco(@PathVariable Integer id, @RequestBody TipoValor tipoValor){
		TipoValor tipoValorser = tiva.findOne(id);
	 tiva.save(tipoValorser);
	}
	@RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id){
	    tiva.delete(id);
	}
}
