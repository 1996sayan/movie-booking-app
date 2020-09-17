package com.movie.inventory.enumValue;

public enum Theatre_Type {
	/**
	 * MULTIPLEX
	 */
	MULTIPLEX("Multiplex"),

	/**
	 * DIRVEIN
	 */
	DIRVEIN("Drive-in");
	/**
	 * code
	 */
	private String code;

	/**
	 * 
	 * @param code
	 */
	private Theatre_Type(String code) {
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
