package com.ednilson.prova.model.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.ednilson.prova.model.enumeration.TipoPessoa;
import com.ednilson.prova.model.util.BaseEntity;

@Entity
@Table(name = "pessoa")
@EntityListeners(AuditingEntityListener.class)
public class Pessoa extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "nome", nullable = false, length = 100)
	@NotNull(message = "O Nome da Pessoa deve ser informado!")
//	@Max(value = 100, message = "O Nome não pode conter mais que 100 caracteres!")
	private String nome;

	@Column(name = "codigo", nullable = false, length = 14, unique = true)
	@NotNull(message = "O CPF/CNPJ da Pessoa deve ser informado!")
	private String codigo;

	@Column(name = "data_nascimento", nullable = false)
	@NotNull(message = "A Data de Nascimento da Pessoa deve ser informada!")
	private LocalDate dataNascimento;

	@Column(name = "nome_mae", length = 100)
//	@Max(value = 100, message = "O Nome da Mãe não pode ter mais que 100 caracteres")
	private String nomeMae;

	@Column(name = "nome_pai", length = 100)
//	@Max(value = 100, message = "O Nome do Pai não pode ter mais que 100 caracteres")
	private String nomePai;

	@Column(name = "data_cadastro", nullable = false)
	private LocalDate dataCadastro = LocalDate.now();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_operador", referencedColumnName = "id", nullable = false)
	private Operador operador;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_pessoa", nullable = false)
	@NotNull(message = "O Tipo de Pessoa deve ser informado!")
	private TipoPessoa tipoPessoa = TipoPessoa.FISICA;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Operador getOperador() {
		return operador;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
