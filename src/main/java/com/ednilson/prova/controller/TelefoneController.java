package com.ednilson.prova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ednilson.prova.model.entity.Telefone;
import com.ednilson.prova.model.service.TelefoneService;
import com.ednilson.prova.model.util.AbstractController;

@RestController
@RequestMapping(value = "/telefones")
public class TelefoneController extends AbstractController<Telefone> {

	@Autowired
	public TelefoneController(TelefoneService service) {
		super(service);
	}

}
