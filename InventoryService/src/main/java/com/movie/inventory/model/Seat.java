package com.movie.inventory.model;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.movie.inventory.Converter.SeatEnumConverter;
import com.movie.inventory.enumValue.Seat_Status;

@Entity
public class Seat {

	@Id
	@Column(name = "seat_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long seatId;

	private String seat_number;

	@Column(name = "seat_status")
	@Convert(converter = SeatEnumConverter.class)
	private Seat_Status seat_status;

	@Column(name = "user_id")
	private long userId;

	public Seat() {
		// TODO Auto-generated constructor stub
	}

	public long getSeatId() {
		return seatId;
	}

	public void setSeatId(long seatId) {
		this.seatId = seatId;
	}

	public String getSeat_number() {
		return seat_number;
	}

	public void setSeat_number(String seat_number) {
		this.seat_number = seat_number;
	}

	public Seat_Status getSeat_status() {
		return seat_status;
	}

	public void setSeat_status(Seat_Status seat_status) {
		this.seat_status = seat_status;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

}
