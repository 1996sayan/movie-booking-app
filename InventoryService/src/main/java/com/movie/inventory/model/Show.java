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

@Table(name = "show")
@Entity
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

	public Show() {
	}

	public long getShowId() {
		return showId;
	}

	public void setShowId(long showId) {
		this.showId = showId;
	}

	public LocalDate getShowDate() {
		return showDate;
	}

	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}

	public LocalTime getShowTime() {
		return showTime;
	}

	public void setShowTime(LocalTime showTime) {
		this.showTime = showTime;
	}

	public long getScreenId() {
		return screenId;
	}

	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}

	public double getShowDuration() {
		return showDuration;
	}

	public void setShowDuration(double showDuration) {
		this.showDuration = showDuration;
	}

	public String getShowLanguage() {
		return showLanguage;
	}

	public void setShowLanguage(String showLanguage) {
		this.showLanguage = showLanguage;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public double getTickerPrice() {
		return tickerPrice;
	}

	public void setTickerPrice(double tickerPrice) {
		this.tickerPrice = tickerPrice;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	public Integer getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(Integer totalSeats) {
		this.totalSeats = totalSeats;
	}

	public Integer getTotalBookedSeats() {
		return totalBookedSeats;
	}

	public void setTotalBookedSeats(Integer totalBookedSeats) {
		this.totalBookedSeats = totalBookedSeats;
	}

	public Integer getTotalAvailableSeats() {
		return totalAvailableSeats;
	}

	public void setTotalAvailableSeats(Integer totalAvailableSeats) {
		this.totalAvailableSeats = totalAvailableSeats;
	}

}
