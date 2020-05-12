package com.ednilson.prova.model.enumeration;

public enum TipoPessoa {
	FISICA("Física"), JURIDICA("Júridica");

	private String descricao;

	TipoPessoa(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return descricao;
	}

}
