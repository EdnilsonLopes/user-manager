package com.ednilson.prova.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ednilson.prova.model.entity.Operador;

public interface OperadorRepository extends JpaRepository<Operador, Integer> {

	@Query(value = "select o from Operador o where o.login=:login and o.senha=:senha")
	public Operador login(@Param("login") String login, @Param("senha") String senha);
}
