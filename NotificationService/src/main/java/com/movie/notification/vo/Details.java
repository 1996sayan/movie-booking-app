package com.movie.notification.vo;

import java.util.List;


public class Details {

	private String userName;

	private String emailId;

	private String phoneNumber;

	private String message;

	private String subject;

	private String movieName;

	private List<String> SeatNumber;

	private String bookingDate;

	public Details(String userName, String emailId, String phoneNumber, String message, String subject,
			String movieName, List<String> seatNumber, String bookingDate) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.message = message;
		this.subject = subject;
		this.movieName = movieName;
		SeatNumber = seatNumber;
		this.bookingDate = bookingDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public List<String> getSeatNumber() {
		return SeatNumber;
	}

	public void setSeatNumber(List<String> seatNumber) {
		SeatNumber = seatNumber;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	
}
