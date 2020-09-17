package com.movie.notification.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Details {

	private String userName;

	private String emailId;

	private String phoneNumber;

	private String message;

	private String subject;

	private String movieName;

	private List<String> SeatNumber;

	private String bookingDate;
}
