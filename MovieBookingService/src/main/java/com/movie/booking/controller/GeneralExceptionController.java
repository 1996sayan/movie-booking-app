package com.movie.booking.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.movie.booking.constant.MovieBookingExceptionCode;
import com.movie.booking.constant.MovieBookingExceptionConstant;
import com.movie.booking.service.impl.ErrorService;
import com.movie.booking.vo.ResponseObject;

@RestControllerAdvice
@Order(value = Ordered.LOWEST_PRECEDENCE)
public class GeneralExceptionController {
	/**
	 * errorService
	 */
	@Autowired
	private ErrorService errorService;

	private static final Logger LOGGER = LoggerFactory.getLogger(GeneralExceptionController.class);

	public ResponseObject<Object> mainException(Exception e) {
		ResponseObject<Object> response = new ResponseObject<Object>();
		LOGGER.error(e.getMessage(), e);

		response = errorService.createErrorResponse(MovieBookingExceptionConstant.GENERAL_ERROR_RESPONSE,
				HttpStatus.INTERNAL_SERVER_ERROR.value(),
				MovieBookingExceptionCode.getValue(MovieBookingExceptionCode.MTS310));
		return response;
	}
}
