package com.movie.user.exception;

public class RecordAlreadyExistsException extends GenericException {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3789898889532457478L;

	public RecordAlreadyExistsException() {
		super();
	}

	public RecordAlreadyExistsException(String message) {
		super(message);
	}

	public RecordAlreadyExistsException(String message, Throwable cause) {
		super(message, cause);
	}

	public RecordAlreadyExistsException(String message, Throwable cause, boolean enableSupression,
			boolean writableStackTrace) {
		super(message, cause, enableSupression, writableStackTrace);
	}

}
