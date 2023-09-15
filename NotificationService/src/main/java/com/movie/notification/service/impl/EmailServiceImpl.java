package com.movie.notification.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.movie.notification.service.EmailService;
import com.movie.notification.service.MyMailSender;
import com.movie.notification.vo.Details;
import com.movie.notification.vo.ResponseObject;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	public MyMailSender emailSender;

	@Override
	public ResponseObject<Details> sendSimpleMessage(String to, String subject, String text) {
		ResponseObject<Details> response=new ResponseObject<>();
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setTo(to);
			message.setSubject(subject);
			message.setText(text);
			emailSender.send(message);
			response.setUserMessage("Mail sent successfully");
		} catch (Exception e) {
			response.setUserMessage("Mail sent unsuccessfull");
			e.printStackTrace();
		}
		return response;
	}
}
