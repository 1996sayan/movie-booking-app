package com.movie.user.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class LoginRequestVo {
	@NotNull(message = "UserName can't be null")
	@Size(min = 3, max = 60)
	private String username;

	@NotNull(message = "Password can't be null")
	@Size(min = 6, max = 40)
	private String password;

	public LoginRequestVo(@NotNull(message = "UserName can't be null") @Size(min = 3, max = 60) String username,
			@NotNull(message = "Password can't be null") @Size(min = 6, max = 40) String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
