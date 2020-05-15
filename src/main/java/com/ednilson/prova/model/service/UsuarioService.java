package com.ednilson.prova.model.service;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ednilson.prova.model.entity.Operador;
import com.ednilson.prova.model.entity.Usuario;
import com.ednilson.prova.model.repository.UsuarioRepository;
import com.ednilson.prova.model.util.AbstractService;
import com.ednilson.prova.model.util.Encrypt;

@Service
public class UsuarioService extends AbstractService<Usuario> {

	private UsuarioRepository repository;

	@Autowired
	public UsuarioService(UsuarioRepository repository) {
		super(repository);
		this.repository = repository;
	}

	public Operador login(Usuario usuario) {
		try {
			usuario.setSenha(Encrypt.encrypt(usuario.getSenha()));
		} catch (UnsupportedEncodingException | GeneralSecurityException e) {
			e.printStackTrace();
		}
		return repository.login(usuario.getLogin(), usuario.getSenha());
	}

}
