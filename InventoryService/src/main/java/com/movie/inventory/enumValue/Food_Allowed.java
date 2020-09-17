package com.movie.inventory.enumValue;

public enum Food_Allowed {

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
	private Food_Allowed(String code) {
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
