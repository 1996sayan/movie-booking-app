package com.movie.user.vo;

import java.io.Serializable;

public class UserDetailsResponseVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String username;
	private String name;
	private String email;

	public UserDetailsResponseVo() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
