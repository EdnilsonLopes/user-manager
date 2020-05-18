package com.ednilson.prova.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ednilson.prova.model.entity.Telefone;
import com.ednilson.prova.model.repository.TelefoneRepository;
import com.ednilson.prova.model.util.AbstractService;

@Service
public class TelefoneService extends AbstractService<Telefone> {

	@Autowired
	public TelefoneService(TelefoneRepository repository) {
		super(repository);
	}

}
