package com.movie.notification.service;

import org.springframework.stereotype.Service;

@Service
public interface EmailService {

	/**
	 * 
	 * @param to
	 * @param subject
	 * @param text
	 */
	void sendSimpleMessage(String to, String subject, String text);

}
