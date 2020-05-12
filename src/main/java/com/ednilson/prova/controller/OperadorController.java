package com.ednilson.prova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ednilson.prova.model.entity.Operador;
import com.ednilson.prova.model.service.OperadorService;
import com.ednilson.prova.model.util.AbstractController;

@RestController
@RequestMapping(value = "/operadores")
public class OperadorController extends AbstractController<Operador> {

	@Autowired
	public OperadorController(OperadorService service) {
		super(service);
	}
}
