package com.movie.user.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.movie.user.vo.ResponseObject;
import com.movie.user.vo.SignUpRequestVo;
import com.movie.user.vo.UserRegistrationResponseVo;

@Service
public interface UserRegistrationService {

	/**
	 * 
	 * @param signUpRequest
	 * @return
	 * @throws UserRegistractionException
	 */
	ResponseObject<UserRegistrationResponseVo> addUser(@Valid SignUpRequestVo signUpRequest);

}
