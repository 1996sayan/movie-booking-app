package com.movie.inventory.vo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.movie.inventory.model.Seat;

public class ShowRequestVo {
	private long movieId;
	private long screenId;
	private LocalDate showDate;

	private LocalTime showTime;
	private double showDuration;
	private String showLanguage;
	private double tickerPrice;
	private List<Seat> seats;
	private Integer totalSeats;
	private Integer totalBookedSeats;
	private Integer totalAvailableSeats;

	public ShowRequestVo() {
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public long getScreenId() {
		return screenId;
	}

	public void setScreenId(long screenId) {
		this.screenId = screenId;
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
