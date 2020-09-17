package com.movie.notification.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.notification.vo.Details;

@RestController
public class NotificationController {
	@GetMapping("/home")
	public Details home() {
		Details details = new Details("Sayan", "sayanmondal291@gmail.com", "7059664120", "Booking Successful",
				"Book a Movie", "", Arrays.asList(""), "");

		return details;
	}
}
