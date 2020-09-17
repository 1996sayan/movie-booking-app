package com.movie.user.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
public class ResponseObject<T> {

	private T data;
	private int statusCode;
	private Error error;
	private String userMessage;

}
