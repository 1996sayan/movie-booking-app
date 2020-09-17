package com.movie.inventory.enumValue;

public enum Parking_Facility {
	/**
	 * TRUE
	 */
	TRUE("True"),

	/**
	 * FALSE
	 */
	FALSE("False");

	/**
	 * code
	 */
	private String code;

	/**
	 * 
	 * @param code
	 */
	private Parking_Facility(String code) {
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
