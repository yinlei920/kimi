package com.hgn.kimi.exception;


public class DAOException extends Exception {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8990506601970288217L;

	public DAOException() {
		super();
	}

	public DAOException(String msg) {
		super(msg);
	}

	public DAOException(Throwable cause) {
		super(cause);
	}

	public DAOException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
