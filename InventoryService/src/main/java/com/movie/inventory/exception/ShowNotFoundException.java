package com.movie.inventory.exception;

public class ShowNotFoundException extends GenericException {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -771951123134908636L;

	public ShowNotFoundException() {
		super();
	}

	public ShowNotFoundException(String message) {
		super(message);
	}

	public ShowNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ShowNotFoundException(String message, Throwable cause, boolean enableSupression,
			boolean writableStackTrace) {
		super(message, cause, enableSupression, writableStackTrace);
	}

}
