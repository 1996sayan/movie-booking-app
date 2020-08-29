package com.movie.booking.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.movie.booking.vo.ResponseObject;
import com.movie.booking.vo.ShowResponseVo;

@FeignClient(url = "", name = "show")
public interface ShowServiceProxy {

	/**
	 * 
	 * @return ResponseObject<ShowResponseVo>
	 */
	@RequestMapping(method = RequestMethod.GET, value = "")
	public ResponseObject<ShowResponseVo> getShowResponse();
}
