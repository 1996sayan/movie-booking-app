package com.movie.booking.constant;

public enum MovieBookingExceptionCode {

	/**
	 * MTS305
	 */
	MTS305,
	/**
	 * MTS307
	 */
	MTS307,
	/**
	 * MTS308
	 */
	MTS308,
	/**
	 * MTS304
	 */
	MTS304,
	/**
	 * MTS302
	 */
	MTS302,
	/**
	 * MTS310
	 */
	MTS310;

	/**
	 * 
	 * @param obj
	 * @return String Exception Code
	 */
	public static String getValue(Object obj) {
		return obj.toString();
	}

}
