package com.movie.inventory.enumValue;

public enum Screen_Type {

	/**
	 * LED
	 */
	LED("LED"),

	/**
	 * PLASMA
	 */
	PLASMA("Plasma");
	/**
	 * code
	 */
	private String code;

	/**
	 * 
	 * @param code
	 */
	private Screen_Type(String code) {
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
