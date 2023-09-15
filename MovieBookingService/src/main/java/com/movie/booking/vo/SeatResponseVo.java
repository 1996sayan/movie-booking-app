package com.movie.booking.vo;


public class SeatResponseVo {

	private int seatId;

	private String seatNumber;

	private String seatClass;

	public SeatResponseVo(int seatId, String seatNumber, String seatClass) {
		super();
		this.seatId = seatId;
		this.seatNumber = seatNumber;
		this.seatClass = seatClass;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getSeatClass() {
		return seatClass;
	}

	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}
	
}
