package com.ednilson.prova.model.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.ednilson.prova.model.enumeration.Perfil;
import com.ednilson.prova.model.util.BaseEntity;

/**
 * 
 * Entidade {@link Operador}
 * 
 * @author Ednilson Brito Lopes
 *
 */
@Entity
@Table(name = "operador")
@EntityListeners(AuditingEntityListener.class)
public class Operador extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	/**
	 * Nome do Operador
	 */
	@Column(name = "nome", nullable = false, length = 100)
	@NotNull(message = "O Nome do Operador deve ser informado!")
//	@Max(value = 100, message = "O Nome não deve conter mais que 100 caracteres!")
	private String nome;

	/**
	 * Login do Operador
	 */
	@Column(name = "login", nullable = false, length = 15, unique = true)
	@NotNull(message = "O Login do Operador deve ser informado!")
//	@Max(value = 15, message = "O Login não deve conter mais que 15 caracteres!")
	private String login;

	/**
	 * Senha do Operador
	 */
	@Column(name = "senha", nullable = false, length = 16)
	@NotNull(message = "A Senha do Operador deve ser informada!")
//	@Size(min = 6, max = 15, message = "A Senha deve conter entre 6 e 15 caracteres!")
	private String senha;

	/**
	 * Perfil do Operador
	 */
	@Enumerated(EnumType.STRING)
	@Column(name = "perfil", nullable = false)
	@NotNull(message = "O Perfil do Operador deve ser informado!")
	private Perfil perfil;

	@Column(name = "data_cadastro", nullable = false)
	private LocalDate dataCadastro = LocalDate.now();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
