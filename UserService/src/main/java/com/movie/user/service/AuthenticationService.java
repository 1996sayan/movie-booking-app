package com.movie.user.service;

import org.springframework.stereotype.Service;

import com.movie.user.vo.JwtResponseVo;
import com.movie.user.vo.LoginRequestVo;
import com.movie.user.vo.ResponseObject;

@Service
public interface AuthenticationService {

	ResponseObject<JwtResponseVo> authenticate(LoginRequestVo loginRequest);
}
