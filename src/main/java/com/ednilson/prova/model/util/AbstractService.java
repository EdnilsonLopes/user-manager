package com.ednilson.prova.model.util;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Ponto de Partida para criação de serviços
 * 
 * @author Ednilson Brito Lopes
 *
 */
@Service
public abstract class AbstractService<T extends BaseEntity> {

	private JpaRepository<T, Integer> repository;
	
	public AbstractService(JpaRepository<T, Integer> repository) {
		this.repository = repository;
	}
	
	public T save(T operador) {
		return repository.save(operador);
	}

	public List<T> saveAll(List<T> operadores) {
		return repository.saveAll(operadores);
	}

	public T update(T operador) {
		return repository.save(operador);
	}

	public List<T> findAll() {
		return repository.findAll();
	}

	public T findOne(Integer id) {
		return repository.findById(id).get();
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}

	
	
}
