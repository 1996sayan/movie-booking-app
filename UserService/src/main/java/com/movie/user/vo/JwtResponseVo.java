//package com.movie.user.vo;
//
//import java.util.Collection;
//
//import org.springframework.security.core.GrantedAuthority;
//
//
//
//public class JwtResponseVo {
//	private String token;
//	private String type = "Bearer";
//	private String username;
//	//@Setter(value = AccessLevel.NONE)
//	private Collection<? extends GrantedAuthority> authorities;
//
//	public JwtResponseVo() {
//		
//	}
//	public JwtResponseVo(String accessToken, String username, Collection<? extends GrantedAuthority> authorities) {
//		this.token = accessToken;
//		this.username = username;
//		this.authorities = authorities;
//	}
//}
