package com.ednilson.prova.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ednilson.prova.model.entity.Operador;
import com.ednilson.prova.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	@Query(value = "select o from Operador o join o.usuario u where u.login=:login and u.senha=:senha")
	public Operador login(@Param("login") String login, @Param("senha") String senha);

}
