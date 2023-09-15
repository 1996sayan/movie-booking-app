package com.movie.notification.controller;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movie.notification.service.EmailService;
import com.movie.notification.service.MyMailSender;
import com.movie.notification.vo.Details;
import com.movie.notification.vo.ResponseObject;

@RestController
public class NotificationController {
	
	@Autowired
	private EmailService mailSender;
	
	private Details details = new Details("Sayan", "sayanmondal291@gmail.com", "7059664120", "Booking Successful",
			"Book a Movie", "", Arrays.asList(""), "");
	
	
	@GetMapping("/home")
	public Details home() {
		Details details = new Details("Sayan", "sayanmondal291@gmail.com", "7059664120", "Booking Successful",
				"Book a Movie", "", Arrays.asList(""), "");

		return details;
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/sendemail")
	public ResponseObject<Details> performMovieBooking()
			{
		ResponseObject<Details> response = mailSender.sendSimpleMessage(details.getEmailId(), details.getSubject(), details.getMessage());
		return response;
	}
	
	
}
