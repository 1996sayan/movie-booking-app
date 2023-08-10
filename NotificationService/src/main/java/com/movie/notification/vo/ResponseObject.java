package com.movie.notification.vo;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseObject<T> {

	private T data;

	private int statusCode;

	private Error error;

	private String userMessage;

	public ResponseObject() {
		
	}
	public ResponseObject(T data, int statusCode, Error error, String userMessage) {
		super();
		this.data = data;
		this.statusCode = statusCode;
		this.error = error;
		this.userMessage = userMessage;
	}
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	public String getUserMessage() {
		return userMessage;
	}

	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}

	
}
