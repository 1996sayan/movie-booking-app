package com.movie.booking.vo;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BookingRequestVo {

	@NotNull(message = "User Id Cannot Be Empty")
	private String username;

	@NotNull(message = "Show Id cannot Be Empty")
	@Positive(message = "Show Id Must Be Positive Integers")
	private long showId;

	private String seatNumber;

	@NotNull(message = "Date Cannot Be Empty")
	@DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
	@FutureOrPresent(message = "Booking Date Cannot Be From Past")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate bookingDate;

	@NotNull(message = "Time Cannot Be Empty")
	@DateTimeFormat(iso = ISO.TIME, pattern = "HH:mm")
	@JsonFormat(pattern = "HH:mm")
	private LocalTime bookingTime;

	@NotNull(message = "Theatre Cannot Be Empty")
	private long theatreId;

	public BookingRequestVo(
		
			@NotNull(message = "Show Id cannot Be Empty") @Positive(message = "Show Id Must Be Positive Integers") long showId,
			String seatNumber,
			@NotNull(message = "Date Cannot Be Empty") @FutureOrPresent(message = "Booking Date Cannot Be From Past") LocalDate bookingDate,
			@NotNull(message = "Time Cannot Be Empty") LocalTime bookingTime,
			@NotNull(message = "Theatre Cannot Be Empty") long theatreId) {
		super();
		this.showId = showId;
		this.seatNumber = seatNumber;
		this.bookingDate = bookingDate;
		this.bookingTime = bookingTime;
		this.theatreId = theatreId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public long getShowId() {
		return showId;
	}

	public void setShowId(long showId) {
		this.showId = showId;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public LocalTime getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(LocalTime bookingTime) {
		this.bookingTime = bookingTime;
	}

	public long getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(long theatreId) {
		this.theatreId = theatreId;
	}

}
