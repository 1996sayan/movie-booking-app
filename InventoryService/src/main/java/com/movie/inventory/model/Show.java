package com.movie.inventory.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "show")
@Entity
@Data
public class Show {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "show_id")
	private long showId;

	private LocalDate showDate;

	private LocalTime showTime;

	private long screenId;

	@Column(name = "show_duration")
	private double showDuration;

	@Column(name = "show_language")
	private String showLanguage;

	@OneToOne(cascade = CascadeType.ALL)
	private Movie movie;

	@Column(name = "ticket_price")
	private double tickerPrice;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Seat> seats;

	@Column(name = "total_seats")
	private Integer totalSeats;

	@Column(name = "total_booked_seats")
	private Integer totalBookedSeats;

	@Column(name = "total_available_seats")
	private Integer totalAvailableSeats;
}
