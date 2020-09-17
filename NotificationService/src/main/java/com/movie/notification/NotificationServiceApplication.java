package com.movie.notification;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.twilio.Twilio;

@SpringBootApplication
public class NotificationServiceApplication {

	private final static String ACCOUNT_SID = "";
	private final static String AUTH_ID = "";

	static {
		Twilio.init(ACCOUNT_SID, AUTH_ID);
	}

	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);
	}

	@Bean
	public NewTopic topic1() {
		return new NewTopic("booking-successful-topic", 1, (short) 2);
	}

}
