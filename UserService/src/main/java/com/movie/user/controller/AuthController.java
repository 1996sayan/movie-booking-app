package com.movie.user.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movie.user.constant.UserServiceConstant;
import com.movie.user.entity.User;
import com.movie.user.exception.UserRegistractionException;
import com.movie.user.service.AuthenticationService;
import com.movie.user.service.UserRegistrationService;
import com.movie.user.service.UserService;
import com.movie.user.vo.JwtResponseVo;
import com.movie.user.vo.LoginRequestVo;
import com.movie.user.vo.ResponseObject;
import com.movie.user.vo.SignUpRequestVo;
import com.movie.user.vo.UserRegistrationResponseVo;

/**
 * @author M1050887
 *
 */
@RestController
@RequestMapping(UserServiceConstant.API_AUTH)
public class AuthController {

	@Autowired
	UserService userService;

	@Autowired
	AuthenticationManager myAuthenticationManager;

	@Autowired
	AuthenticationService authenticationService;

	@Autowired
	UserRegistrationService userRegistrationService;

	@RequestMapping(method = RequestMethod.GET, value = "/name")
	public String getString() {
		return "Hi";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public String addUser() {
		return userService.adduser();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getuser")
	public List<User> getUser() {
		return userService.getAllUser();
	}

	@RequestMapping(method = RequestMethod.POST, value = UserServiceConstant.USER_SIGN_IN)
	public ResponseObject<JwtResponseVo> authenticateUser(@Valid @RequestBody LoginRequestVo loginRequest) {

		return authenticationService.authenticate(loginRequest);

	}

	@RequestMapping(method = RequestMethod.POST, value = UserServiceConstant.USER_SIGN_UP)
	public ResponseObject<UserRegistrationResponseVo> registerUser(@Valid @RequestBody SignUpRequestVo signUpRequest)
			throws UserRegistractionException {
		return userRegistrationService.addUser(signUpRequest);
	}

}
