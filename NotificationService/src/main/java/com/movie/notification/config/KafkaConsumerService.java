package com.movie.notification.config;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.movie.notification.service.impl.EmailServiceImpl;
import com.movie.notification.util.PropertiesCache;
import com.movie.notification.vo.Details;

@Service
public class KafkaConsumerService {

	private PropertiesCache prop = PropertiesCache.getInstance();

	private String seatNums;

	@Autowired
	private EmailServiceImpl mailSender;

//	@Autowired
//	private SendSMS messageSender;

	private String content = prop.getProperty("SEND.SMS.NOTIFICATION.CONTENT");

	@KafkaListener(topics = "booking-successful-topic", groupId = "sample-group", containerFactory = "kafkaListenerContainerFactory")
	public void consume(Details details) {

		String[] dateTime = details.getBookingDate().split("::");

		seatNums = new String();

		details.getSeatNumber().forEach(seat -> {
			seatNums += seat + ",";
		});

		seatNums = seatNums.substring(0, (seatNums.length() - 2));

		if (content != null && !content.isEmpty()) {

			content = StringUtils.replaceEach(content, new String[] { "{1}", "{2}", "{3}", "{4}", "{5}" },
					new String[] { details.getUserName(), dateTime[0], dateTime[1], details.getMovieName(), seatNums });
		}

		if (details.getSeatNumber().size() >= 1) {
			content = content.replace("seat", "seats");
		}

//		new SendSMS().sendSMS(new SmsRequest(details.getPhoneNumber(), content));
		mailSender.sendSimpleMessage(details.getEmailId(), details.getSubject(), content);

	}
}