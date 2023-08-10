package com.movie.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movie.user.service.impl.UserDetailsServiceImpl;
import com.movie.user.vo.ResponseObject;
import com.movie.user.vo.UserDetailsResponseVo;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/access")
public class ByPassController {

	@Autowired
	private UserDetailsServiceImpl userDetailsService;

	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}

	@GetMapping(value = "/user/{username}")
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public ResponseObject<UserDetailsResponseVo> userAccess(@PathVariable("username") String username) {
		return userDetailsService.getUserByUserId(username);
	}

}
