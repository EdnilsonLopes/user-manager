package com.ednilson.prova.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ednilson.prova.model.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
