package com.ednilson.prova.model.util;

import java.io.Serializable;

/**
 * Ponto base para criação de entidades
 * 
 * @author Ednilson Brito Lopes
 *
 */
public abstract class BaseEntity implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 7322714083484721792L;

	public abstract Integer getId();

	public abstract void setId(Integer id);

}
