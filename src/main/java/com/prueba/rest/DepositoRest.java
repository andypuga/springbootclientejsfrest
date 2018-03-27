package com.prueba.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.data.Deposito;
import com.prueba.repository.IDeposito;
@RestController("/deposito")
public class DepositoRest {
	@Autowired
	IDeposito depo;
	@RequestMapping("/lista")
	public List<Deposito>  allCreditos() {
		return depo.findAll();
	}
	@RequestMapping(value="/uno/{id}",method=RequestMethod.GET)
	public Deposito  onebanco( @PathVariable Integer id) {
		return depo.findOne(id);
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void saveBanco(@RequestBody Deposito deposito ){
	    depo.save(deposito);  
	}
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public void updatebanco(@PathVariable Integer id, @RequestBody Deposito deposito){
	    Deposito depositoser = depo.findOne(id);
	    depo.save(depositoser);
	}
	@RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id){
	    depo.delete(id);
	}
}
