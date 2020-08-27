package com.movie.booking.vo;

import lombok.Data;

@Data
public class UserDetailsResponseVo {

	private long userDetailsId;

	private String userFname;

	private String userLname;

	private String userName;

	private String userEmail;

	private String userPassword;

	private String userPhoneNo;

	private String userAddress;
}
