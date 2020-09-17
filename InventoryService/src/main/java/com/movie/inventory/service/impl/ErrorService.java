package com.movie.inventory.service.impl;

import org.springframework.stereotype.Service;

import com.movie.inventory.util.PropertiesCache;
import com.movie.inventory.vo.Error;
import com.movie.inventory.vo.ResponseObject;

@Service
public class ErrorService {
	PropertiesCache cache = PropertiesCache.getInstance();

	public ResponseObject<Object> createErrorResponse(String userMessage, int statusCode, String errorCode) {
		ResponseObject<Object> responseObject = new ResponseObject<Object>();
		responseObject.setUserMessage(userMessage);
		responseObject.setStatusCode(statusCode);
		Error error = new Error();
		error.setErrorCode(errorCode);
		error.setErrorMessage(cache.getProperty(errorCode));

		responseObject.setError(error);
		return responseObject;

	}
}
