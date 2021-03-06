package com.movie.user.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class LoginRequestVo {
	@NotNull(message = "UserName can't be null")
	@Size(min = 3, max = 60)
	private String username;

	@NotNull(message = "Password can't be null")
	@Size(min = 6, max = 40)
	private String password;
}
