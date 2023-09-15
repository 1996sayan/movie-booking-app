package com.movie.notification.service;

import org.springframework.stereotype.Service;

import com.movie.notification.vo.Details;
import com.movie.notification.vo.ResponseObject;

@Service
public interface EmailService {

	/**
	 * 
	 * @param to
	 * @param subject
	 * @param text
	 */
	ResponseObject<Details> sendSimpleMessage(String to, String subject, String text);

}
