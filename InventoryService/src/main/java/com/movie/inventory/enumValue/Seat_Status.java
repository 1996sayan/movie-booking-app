package com.movie.inventory.enumValue;

public enum Seat_Status {

	/**
	 * PENDING
	 */
	PENDING("Pending"),
	/**
	 * BOOKED
	 */
	BOOKED("Booked");

	/**
	 * code
	 */
	private String code;

	/**
	 * 
	 * @param code
	 */
	private Seat_Status(String code) {
		this.code = code;
	}

	/**
	 * 
	 * @return String
	 */
	public String getCode() {
		return code;
	}
}
