package com.ednilson.prova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ednilson.prova.model.entity.Pessoa;
import com.ednilson.prova.model.service.PessoaService;
import com.ednilson.prova.model.util.AbstractController;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController extends AbstractController<Pessoa> {

	@Autowired
	public PessoaController(PessoaService service) {
		super(service);
	}

}
