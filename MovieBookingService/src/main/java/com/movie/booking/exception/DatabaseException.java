package com.movie.booking.exception;

public class DatabaseException extends GenericException {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1220669946622772242L;

	public DatabaseException() {
		super();
	}

	public DatabaseException(String message) {
		super(message);
	}

	public DatabaseException(Throwable cause) {
		super(cause);
	}

	public DatabaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public DatabaseException(String message, Throwable cause, boolean enableSupression, boolean writableStackTrace) {
		super(message, cause, enableSupression, writableStackTrace);
	}

}
