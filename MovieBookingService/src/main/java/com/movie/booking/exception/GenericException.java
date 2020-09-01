package com.movie.booking.exception;

public class GenericException extends Exception {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7944048562869532836L;

	public GenericException() {
		super();
	}

	public GenericException(String message) {
		super(message);
	}

	public GenericException(Throwable cause) {
		super(cause);
	}

	public GenericException(String message, Throwable cause) {
		super(message, cause);
	}

	public GenericException(String message, Throwable cause, boolean enableSupression, boolean writableStackTrace) {
		super(message, cause, enableSupression, writableStackTrace);
	}

}
