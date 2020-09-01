package com.movie.booking.vo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import lombok.Data;

@Data
public class BookingResponseVo {

	private long userId;

	private long bookingId;

	private long showId;

	private List<String> seatNumber;

	private LocalDate bookingDate;

	private LocalTime bookingTime;
}
