package com.movie.booking.service.impl;

import org.springframework.stereotype.Service;

import com.movie.booking.util.PropertiesCache;
import com.movie.booking.vo.Error;
import com.movie.booking.vo.ResponseObject;

@Service
public class ErrorService {

	/**
	 * cache
	 */
	PropertiesCache cache = PropertiesCache.getInstance();

	/**
	 * Create error response
	 * 
	 * @param userMessage
	 * @param statusCode
	 * @param errorCode
	 * @return
	 */
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
