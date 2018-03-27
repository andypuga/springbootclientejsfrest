package com.prueba.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.prueba.data.Credito;
import com.prueba.repository.ICredito;
@RestController("/credito")
public class CreditoRest {
	@Autowired
	ICredito cred;
	@RequestMapping("/lista")
	public List<Credito>  allCreditos() {
		return cred.findAll();
	}
	@RequestMapping(value="/uno/{id}",method=RequestMethod.GET)
	public Credito  onebanco( @PathVariable Integer id) {
		return cred.findOne(id);
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void saveBanco(@RequestBody Credito credito ){
	    cred.save(credito);  
	}
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public void updatebanco(@PathVariable Integer id, @RequestBody Credito credito){
	    Credito creditoser = cred.findOne(id);
	    creditoser.setIdCredito(credito.getIdCredito());
	    creditoser.setDetalle(credito.getDetalle());
	    creditoser.setFecha(credito.getFecha());
	    creditoser.setIdCuenta(credito.getIdCuenta());
	    creditoser.setInteres(credito.getInteres());
	    creditoser.setPlazo(credito.getPlazo ());
	    creditoser.setTotal(credito.getTotal());
	    creditoser.setValor(credito.getValor());
	    cred.save(creditoser);
	}
	@RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id){
	    cred.delete(id);
	}
}
