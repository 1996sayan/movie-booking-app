package com.movie.inventory.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.inventory.constant.MovieShowConstant;
import com.movie.inventory.service.ShowService;
import com.movie.inventory.vo.ResponseObject;
import com.movie.inventory.vo.ShowResponseVo;

@RestController
@RequestMapping(value = MovieShowConstant.SHOW)
public class MovieShowController {

	/**
	 * showService
	 */
	ShowService showService;

//	public ResponseObject<ShowResponseVo> addShowDetails(AddShowRequestVo request,
//			ResponseObject<MovieResponseVo> movieResponse, ResponseObject<ScreenResponseVo> screenResponse) {
//		return null;
//	}

	public ResponseObject<List<ShowResponseVo>> getAllShowDetails() {
		return showService.getAllShowDetails();
	}

	public ResponseObject<ShowResponseVo> getShowDetailsByShowId(long showId) {
		return showService.getShowDetailsByShowId(showId);
	}
}
