package com.prueba.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.prueba.data.Ingresos;

import com.prueba.repository.IIngreso;
@RestController("/ingreso")
public class IngresoRest {
	@Autowired
	IIngreso ingre;
	@RequestMapping("/lista")
	public List<Ingresos>  allCreditos() {
		return ingre.findAll();
	}
	@RequestMapping(value="/uno/{id}",method=RequestMethod.GET)
	public Ingresos oneingreso( @PathVariable Integer id) {
		return ingre.findOne(id);
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void saveBanco(@RequestBody Ingresos ingreso ){
	    ingre.save(ingreso);  
	}
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public void updatebanco(@PathVariable Integer id, @RequestBody Ingresos ingreso){
	 Ingresos ingresoser = ingre.findOne(id);
	 ingresoser.setIdIngresos(ingreso.getIdIngresos());
	 ingresoser.setIdBanco(ingreso.getIdBanco());
	 ingresoser.setDetalle(ingreso.getDetalle());
	 ingresoser.setIdTipovalor(ingreso.getIdTipovalor());
	 ingresoser.setValor(ingreso.getValor());
	 ingresoser.setMemo(ingreso.getMemo());
	 ingre.save(ingresoser);
	}
	@RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id){
	    ingre.delete(id);
	}
}
