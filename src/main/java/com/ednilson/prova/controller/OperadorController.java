package com.ednilson.prova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ednilson.prova.model.entity.Operador;
import com.ednilson.prova.model.service.OperadorService;
import com.ednilson.prova.model.util.AbstractController;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping(value = "/operadores")
public class OperadorController extends AbstractController<Operador> {

	private OperadorService service;

	@Autowired
	public OperadorController(OperadorService service) {
		super(service);
		this.service = service;
	}

	@RequestMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public LoginToken login(@RequestBody Operador operador) {
		Operador result = service.login(operador);
//		return new ResponseEntity<Operador>(result, result != null ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST);
		JwtBuilder builder = Jwts.builder();
		String token = builder.setSubject(operador.getLogin()).signWith(SignatureAlgorithm.HS256, "miranteEdnilsonApp")
				.compact();
		return new LoginToken(token);
	}

	private class LoginToken {
		public String token;

		public LoginToken(String token) {
			this.token = token;
		}

	}
}
