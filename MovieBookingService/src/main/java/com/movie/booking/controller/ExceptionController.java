package com.movie.booking.controller;

import javax.persistence.EntityNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.movie.booking.constant.MovieBookingExceptionCode;
import com.movie.booking.constant.MovieBookingExceptionConstant;
import com.movie.booking.exception.DatabaseException;
import com.movie.booking.exception.RecordAlreadyExistsException;
import com.movie.booking.exception.ShowNotFoundException;
import com.movie.booking.service.impl.ErrorService;
import com.movie.booking.vo.Error;
import com.movie.booking.vo.ResponseObject;

@RestControllerAdvice
@Order(value = Ordered.HIGHEST_PRECEDENCE)
public class ExceptionController {

	/**
	 * errorService
	 */
	@Autowired
	private ErrorService errorService;

	private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionController.class);

	/**
	 * 
	 * @param EntityNotFoundException
	 * @return ResponseObject<Object>
	 */
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseObject<Object> entityNotFoundException(EntityNotFoundException e) {
		LOGGER.error(e.getMessage());
		ResponseObject<Object> response = errorService.createErrorResponse(
				MovieBookingExceptionConstant.ENTITY_NOT_FOUND, HttpStatus.NOT_FOUND.value(),
				MovieBookingExceptionCode.getValue(MovieBookingExceptionCode.MTS302));
		return response;
	}

	/**
	 * 
	 * @param RecordAlreadyExistsException
	 * @return ResponseObject<Object>
	 */
	@ExceptionHandler(RecordAlreadyExistsException.class)
	public ResponseObject<Object> recordAlreadyExistsException(RecordAlreadyExistsException e) {
		LOGGER.error(e.getMessage());
		ResponseObject<Object> response = errorService.createErrorResponse(MovieBookingExceptionConstant.SEAT_EXISTS,
				HttpStatus.BAD_REQUEST.value(), MovieBookingExceptionCode.getValue(MovieBookingExceptionCode.MTS304));
		return response;
	}

	/**
	 * 
	 * @param DatabaseException
	 * @return ResponseObject<Object>
	 */
	@ExceptionHandler(DatabaseException.class)
	public ResponseObject<Object> databaseException(DatabaseException e) {
		LOGGER.error(e.getMessage());
		ResponseObject<Object> response = errorService.createErrorResponse(MovieBookingExceptionConstant.SEAT_EXISTS,
				HttpStatus.BAD_REQUEST.value(), MovieBookingExceptionCode.getValue(MovieBookingExceptionCode.MTS304));
		return response;
	}

	/**
	 * 
	 * @param MethodArgumentNotValidException
	 * @return ResponseObject<Object>
	 */
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseObject<Object> validationException(MethodArgumentNotValidException e) {
		ResponseObject<Object> response = new ResponseObject<Object>();
		response.setData(null);
		String userError = "/ ";
		String fieldError = "/ ";
		LOGGER.error(e.getMessage());
		response.setStatusCode(HttpStatus.BAD_REQUEST.value());
		for (ObjectError objectError : e.getBindingResult().getAllErrors()) {
			userError += objectError.getDefaultMessage() + " \n";
			FieldError fe = (FieldError) objectError;
			fieldError += fe.getField() + ": " + objectError.getDefaultMessage() + " \n";
		}
		response.setUserMessage(userError);
		response.setError(new Error(MovieBookingExceptionCode.getValue(MovieBookingExceptionCode.MTS307), fieldError));
		return response;
	}

	/**
	 * 
	 * @param ShowNotFoundException
	 * @return ResponseObject<Object>
	 */
	@ExceptionHandler(ShowNotFoundException.class)
	ResponseObject<Object> showNotFoundException(ShowNotFoundException e) {
		ResponseObject<Object> response = errorService.createErrorResponse(MovieBookingExceptionConstant.SHOW_NOT_EXIST,
				HttpStatus.NOT_FOUND.value(), MovieBookingExceptionCode.getValue(MovieBookingExceptionCode.MTS308));
		return response;
	}

	/**
	 * 
	 * @param HttpMessageNotReadableException
	 * @return ResponseObject<Object>
	 */
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseObject<Object> parseException(HttpMessageNotReadableException e) {
		ResponseObject<Object> response = errorService.createErrorResponse(
				MovieBookingExceptionConstant.DATA_PARSE_ERROR, HttpStatus.INTERNAL_SERVER_ERROR.value(),
				MovieBookingExceptionCode.getValue(MovieBookingExceptionCode.MTS307));
		LOGGER.error(e.getMessage());
		return response;
	}

	/**
	 * 
	 * @param MismatchedInputException
	 * @return ResponseObject<Object>
	 */
	@ExceptionHandler(MismatchedInputException.class)
	public ResponseObject<Object> parseException(MismatchedInputException e) {
		ResponseObject<Object> response = errorService.createErrorResponse(
				MovieBookingExceptionConstant.TIME_PARSE_ERROR, HttpStatus.INTERNAL_SERVER_ERROR.value(),
				MovieBookingExceptionCode.getValue(MovieBookingExceptionCode.MTS307));
		LOGGER.error(e.getMessage());
		return response;
	}

}
