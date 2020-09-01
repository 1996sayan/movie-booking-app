package com.movie.booking.vo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class BookingRequestVo {

	@NotNull(message = "User Id Cannot Be Empty")
	@Positive(message = "User Id Must Be Positive Integers")
	private long userId;

	@NotNull(message = "Show Id cannot Be Empty")
	@Positive(message = "Show Id Must Be Positive Integers")
	private long showId;

	private List<String> seatNumber;

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
}
