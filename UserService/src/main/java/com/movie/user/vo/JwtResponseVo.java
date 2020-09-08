package com.movie.user.vo;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class JwtResponseVo {
	private String token;
	private String type = "Bearer";
	private String userName;
	@Setter(value = AccessLevel.NONE)
	private Collection<? extends GrantedAuthority> authorities;

	public JwtResponseVo(String token, String userName, Collection<? extends GrantedAuthority> authorities) {
		super();
		this.token = token;
		this.userName = userName;
		this.authorities = authorities;
	}

}
