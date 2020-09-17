package com.movie.inventory.model;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.movie.inventory.Converter.SeatEnumConverter;
import com.movie.inventory.enumValue.Seat_Status;

import lombok.Data;

@Entity
@Data
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
}
