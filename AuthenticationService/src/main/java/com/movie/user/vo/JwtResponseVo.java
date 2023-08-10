package com.movie.user.vo;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class JwtResponseVo {
	private String token;
	private String type = "Bearer";
	private String username;
	// @Setter(value = AccessLevel.NONE)
	private Collection<? extends GrantedAuthority> authorities;

	public JwtResponseVo() {

	}

	public JwtResponseVo(String accessToken, String username, Collection<? extends GrantedAuthority> authorities) {
		this.token = accessToken;
		this.username = username;
		this.authorities = authorities;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

}
