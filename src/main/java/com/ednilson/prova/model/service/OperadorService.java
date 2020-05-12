package com.ednilson.prova.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ednilson.prova.model.entity.Operador;
import com.ednilson.prova.model.repository.OperadorRepository;
import com.ednilson.prova.model.util.AbstractService;

@Service
public class OperadorService extends AbstractService<Operador> {

	@Autowired
	public OperadorService(OperadorRepository operadorRepository) {
		super(operadorRepository);
	}

}
