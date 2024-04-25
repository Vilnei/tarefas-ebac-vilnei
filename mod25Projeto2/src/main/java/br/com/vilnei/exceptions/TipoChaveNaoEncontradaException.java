package br.com.vilnei.exceptions;

import java.io.Serial;

/**
 * @author vilnei
 */
public class TipoChaveNaoEncontradaException extends Exception {

    
	@Serial
    private static final long serialVersionUID = -1389494676398525746L;

	public TipoChaveNaoEncontradaException(String msg) {
        this(msg, null);
    }

    public TipoChaveNaoEncontradaException(String msg, Throwable e) {
        super(msg, e);
    }
}
