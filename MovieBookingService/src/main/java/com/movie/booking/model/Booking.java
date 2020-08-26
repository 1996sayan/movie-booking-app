package com.movie.booking.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "BOOKING")
@Data
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookingId;

	private long userId;

	private long showId;

	@ElementCollection
	@CollectionTable(name = "BOOKING_SEAT_DETAILS", joinColumns = @JoinColumn(name = "bookingId"))
	@Column(name = "seat_number")
	private List<String> seatNumber;

	private LocalDate bookingDate;

	private LocalTime bookingTime;
}
