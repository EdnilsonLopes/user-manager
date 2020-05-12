package com.ednilson.prova.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ednilson.prova.model.entity.Pessoa;
import com.ednilson.prova.model.repository.PessoaRepository;
import com.ednilson.prova.model.util.AbstractService;

@Service
public class PessoaService extends AbstractService<Pessoa> {

	@Autowired
	public PessoaService(PessoaRepository repository) {
		super(repository);
	}

}
