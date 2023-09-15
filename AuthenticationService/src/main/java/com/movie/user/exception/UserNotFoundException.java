package com.movie.user.exception;

public class UserNotFoundException extends GenericException {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -771951123134908632L;

	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(String message) {
		super(message);
	}

	public UserNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserNotFoundException(String message, Throwable cause, boolean enableSupression,
			boolean writableStackTrace) {
		super(message, cause, enableSupression, writableStackTrace);
	}

}
