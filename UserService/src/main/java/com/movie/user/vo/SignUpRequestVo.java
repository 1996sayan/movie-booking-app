package com.movie.user.vo;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class SignUpRequestVo {
	@NotNull(message = "Name can't be null")
	@Size(min = 3, max = 50)
	private String name;

	@NotNull(message = "UserName can't be null")
	@Size(min = 3, max = 50)
	private String username;

	@NotNull(message = "Email can't be null")
	@Size(max = 60)
	@Email
	private String email;

	private Set<String> role;

	@NotNull(message = "Password can't be null")
	@Size(min = 6, max = 40)
	private String password;
}
