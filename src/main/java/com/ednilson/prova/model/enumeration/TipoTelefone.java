package com.ednilson.prova.model.enumeration;

public enum TipoTelefone {

	CELULAR, FIXO, COMERCIAL;

	@Override
	public String toString() {
		return name();
	}

}
