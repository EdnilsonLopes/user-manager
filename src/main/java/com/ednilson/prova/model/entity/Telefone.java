package com.ednilson.prova.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ednilson.prova.model.enumeration.TipoTelefone;
import com.ednilson.prova.model.util.BaseEntity;

@Entity
@Table(name = "telefone")
public class Telefone extends BaseEntity {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 4043964502237686345L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "ddd", nullable = false, length = 3)
	@Size(max = 3, message = "O DDD não pode conter mais que 3 caracteres!")
	@NotNull(message = "O DDD deve ser informado!")
	private Integer ddd;

	@Column(name = "numero", nullable = false, length = 10)
	@Size(min = 8, max = 10, message = "O Número deve conter entre 8 e 10 digitos")
	@NotNull(message = "O Número deve ser informado!")
	private Integer numero;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_telefone", nullable = false, length = 30)
	private TipoTelefone tipoTelefone;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_cadastro", nullable = false)
	private Date dataCadastro = new Date();

	@ManyToOne
	@JoinColumn(name = "id_operador", referencedColumnName = "id", nullable = false)
	private Operador operador;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Operador getOperador() {
		return operador;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}

}
