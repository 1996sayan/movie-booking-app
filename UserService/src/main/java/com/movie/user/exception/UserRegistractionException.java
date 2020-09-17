package com.movie.user.exception;

public class UserRegistractionException extends Exception {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public UserRegistractionException() {
		super();
	}

	public UserRegistractionException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public UserRegistractionException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public UserRegistractionException(String arg0) {
		super(arg0);
	}

	public UserRegistractionException(Throwable arg0) {
		super(arg0);
	}

}
