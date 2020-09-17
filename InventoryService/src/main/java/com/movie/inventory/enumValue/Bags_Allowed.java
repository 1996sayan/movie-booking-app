package com.movie.inventory.enumValue;

public enum Bags_Allowed {

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
	private Bags_Allowed(String code) {
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
