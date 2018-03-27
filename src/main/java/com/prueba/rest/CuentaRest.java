package com.prueba.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.prueba.data.Cuenta;
import com.prueba.repository.ICuenta;
@RestController("/cuenta")
public class CuentaRest {
	@Autowired
	ICuenta cuent;
	@RequestMapping("/lista")
	public List<Cuenta>  allCreditos() {
		return cuent.findAll();
	}
	@RequestMapping(value="/uno/{id}",method=RequestMethod.GET)
	public Cuenta  onebanco( @PathVariable Integer id) {
		return cuent.findOne(id);
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void saveBanco(@RequestBody Cuenta cuenta ){
	    cuent.save(cuenta);  
	}
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public void updatebanco(@PathVariable Integer id, @RequestBody Cuenta cuenta){
	    Cuenta cuentaser = cuent.findOne(id);
	    cuentaser.setIdCuenta(cuenta.getIdCuenta());
	    cuentaser.setNumCuenta(cuenta.getNumCuenta());
	    cuentaser.setDetalle(cuenta.getDetalle());
	    cuentaser.setIdPersona(cuenta.getIdPersona());
	    cuentaser.setValorTotal(cuenta.getValorTotal());
	    cuent.save(cuentaser);
	}
	@RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id){
	    cuent.delete(id);
	}
} 
