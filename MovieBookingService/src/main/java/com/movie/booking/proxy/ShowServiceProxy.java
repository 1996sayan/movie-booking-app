package com.movie.booking.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.movie.booking.vo.ResponseObject;
import com.movie.booking.vo.ShowResponseVo;

@FeignClient(url = "http://localhost:8072", name = "show-details")
public interface ShowServiceProxy {

	/**
	 * 
	 * @return ResponseObject<ShowResponseVo>
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/show/show/find/id/{showId}", produces = "application/json")
	public ResponseObject<ShowResponseVo> getShowResponse(@RequestHeader("Authorization") String bearerToken,
			@PathVariable("showId") long showId);
}
