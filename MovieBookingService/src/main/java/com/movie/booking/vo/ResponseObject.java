package com.movie.booking.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ResponseObject<T> {

	private T data;

	private int statusCode;

	private Error error;

	private String userMessage;

}
