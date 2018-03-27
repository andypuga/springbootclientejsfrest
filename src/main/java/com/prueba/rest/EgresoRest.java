package com.prueba.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.data.Deposito;
import com.prueba.data.Egresos;
import com.prueba.repository.IDeposito;
import com.prueba.repository.IEgreso;

@RestController("/egreso")
public class EgresoRest {
	@Autowired
	IEgreso egre;
	@RequestMapping("/lista")
	public List<Egresos>  allCreditos() {
		return egre.findAll();
	}
	@RequestMapping(value="/uno/{id}",method=RequestMethod.GET)
	public Egresos  onebanco( @PathVariable Integer id) {
		return egre.findOne(id);
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void saveBanco(@RequestBody Egresos egreso ){
	    egre.save(egreso);  
	}
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public void updatebanco(@PathVariable Integer id, @RequestBody Egresos egreso){
	 Egresos egresoser = egre.findOne(id);
	 egresoser.setIdEgresos(egreso.getIdEgresos());
	 egresoser.setDetalle(egreso.getDetalle());
	 egresoser.setIdBanco(egreso.getIdBanco());
	 egresoser.setIdTipovalor(egreso.getIdTipovalor());
	 egresoser.setMemo(egreso.getMemo());
	 egresoser.setValor(egreso.getValor());
	 
	 egre.save(egresoser);
	}
	@RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id){
	    egre.delete(id);
	}
}
