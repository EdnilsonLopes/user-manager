package com.ednilson.prova.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ednilson.prova.model.entity.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Integer> {

}
