package com.movie.user.exception;

public class UserNameAlreadyExistException extends UserRegistractionException {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public UserNameAlreadyExistException() {
		super();
	}

	public UserNameAlreadyExistException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public UserNameAlreadyExistException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public UserNameAlreadyExistException(String arg0) {
		super(arg0);
	}

	public UserNameAlreadyExistException(Throwable arg0) {
		super(arg0);
	}

}
