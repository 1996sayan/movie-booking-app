package com.movie.booking.proxy;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.movie.booking.vo.ResponseObject;
import com.movie.booking.vo.UserDetailsResponseVo;

import feign.Headers;

	
@FeignClient(url = "http://localhost:8091", name = "user-details")
public interface UserServiceProxy {

	/**
	 * 
	 * @return ResponseObject<UserDetailsResponseVo>
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/api/access/user/{username}", produces = "application/json")
	@Headers("Content-Type: application/json")
	public ResponseObject<UserDetailsResponseVo> getUserDetails(@RequestHeader("Authorization") String bearerToken, @PathVariable("username") String username);
}
