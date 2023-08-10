package com.movie.user.vo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.movie.user.model.Role;

public class UserRegistrationResponseVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String username;
	private String email;
	private Set<Role> roles = new HashSet<>();

	public UserRegistrationResponseVo() {
	}

	public UserRegistrationResponseVo(String name, String username, String email, Set<Role> roles) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.roles = roles;
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

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
