package com.movie.user.vo;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



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

	public SignUpRequestVo() {
		
	}
	
	public SignUpRequestVo(@NotNull(message = "Name can't be null") @Size(min = 3, max = 50) String name,
			@NotNull(message = "UserName can't be null") @Size(min = 3, max = 50) String username,
			@NotNull(message = "Email can't be null") @Size(max = 60) @Email String email, Set<String> role,
			@NotNull(message = "Password can't be null") @Size(min = 6, max = 40) String password) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.role = role;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<String> getRole() {
		return role;
	}

	public void setRole(Set<String> role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
