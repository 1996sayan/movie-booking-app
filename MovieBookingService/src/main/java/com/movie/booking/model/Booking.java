package com.movie.booking.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKING")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookingId;

	private String username;

	private long showId;

//	@ElementCollection
//	@CollectionTable(name = "BOOKING_SEAT_DETAILS", joinColumns = @JoinColumn(name = "bookingId"))
//	@Column(name = "seat_number")
//	private List<String> seatNumber;

	private LocalDate bookingDate;

	private LocalTime bookingTime;

	@Column(name = "seat_number")
	private String seatNumber;

	private long theatreId;

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public long getShowId() {
		return showId;
	}

	public void setShowId(long showId) {
		this.showId = showId;
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

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public long getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(long theatreId) {
		this.theatreId = theatreId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookingDate, bookingId, bookingTime, seatNumber, showId, theatreId, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		return Objects.equals(bookingDate, other.bookingDate) && bookingId == other.bookingId
				&& Objects.equals(bookingTime, other.bookingTime) && Objects.equals(seatNumber, other.seatNumber)
				&& showId == other.showId && theatreId == other.theatreId && Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", username=" + username + ", showId=" + showId + ", bookingDate="
				+ bookingDate + ", bookingTime=" + bookingTime + ", seatNumber=" + seatNumber + ", theatreId="
				+ theatreId + "]";
	}

}
