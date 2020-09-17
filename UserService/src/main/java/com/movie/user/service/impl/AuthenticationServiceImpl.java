package com.movie.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.movie.user.security.JwtProvider;
import com.movie.user.service.AuthenticationService;
import com.movie.user.service.MyAuthenticationManager;
import com.movie.user.vo.JwtResponseVo;
import com.movie.user.vo.LoginRequestVo;
import com.movie.user.vo.ResponseObject;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	MyAuthenticationManager myAuthenticationManager;

	@Autowired
	JwtProvider jwtProvider;

	@Override
	public ResponseObject<JwtResponseVo> authenticate(LoginRequestVo loginRequest) {

		Authentication authentication = myAuthenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtProvider.generateJwtToken(authentication);
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		ResponseObject<JwtResponseVo> response = new ResponseObject<JwtResponseVo>();
		response.setData(new JwtResponseVo(jwt, userDetails.getUsername(), userDetails.getAuthorities()));
		response.setUserMessage("Sign in Success");
		response.setStatusCode(200);
		return response;
	}

}
