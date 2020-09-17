package com.movie.user.exception;

public class EmailAlreadyExistsException extends UserRegistractionException {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public EmailAlreadyExistsException() {
		super();
	}

	public EmailAlreadyExistsException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public EmailAlreadyExistsException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public EmailAlreadyExistsException(String arg0) {
		super(arg0);
	}

	public EmailAlreadyExistsException(Throwable arg0) {
		super(arg0);
	}

}
