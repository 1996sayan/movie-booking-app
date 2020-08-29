package com.movie.booking.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.movie.booking.vo.ResponseObject;
import com.movie.booking.vo.UserDetailsResponseVo;

@FeignClient(url = "", name = "")
public interface UserServiceProxy {

	/**
	 * 
	 * @return ResponseObject<UserDetailsResponseVo>
	 */
	@RequestMapping(method = RequestMethod.GET, value = "")
	public ResponseObject<UserDetailsResponseVo> getUserDetails();
}
