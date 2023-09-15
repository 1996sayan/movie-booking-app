package com.movie.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movie.inventory.constant.MovieShowConstant;
import com.movie.inventory.exception.DatabaseException;
import com.movie.inventory.exception.RecordAlreadyExistsException;
import com.movie.inventory.exception.ShowNotFoundException;
import com.movie.inventory.service.MovieService;
import com.movie.inventory.service.ShowService;
import com.movie.inventory.vo.MovieRequestVo;
import com.movie.inventory.vo.MovieResponseVo;
import com.movie.inventory.vo.ResponseObject;
import com.movie.inventory.vo.ShowRequestVo;
import com.movie.inventory.vo.ShowResponseVo;

@RestController
@RequestMapping(value = MovieShowConstant.SHOW)
public class MovieShowController {

	/**
	 * showService
	 */
	@Autowired
	ShowService showService;

	/*
	 * movieService
	 */
	@Autowired
	MovieService movieService;

	
	@RequestMapping(method=RequestMethod.POST,value=MovieShowConstant.ADD_SHOW)
	public ResponseObject<MovieResponseVo> addMovieDetails(MovieRequestVo request) {
		return movieService.addMovieDetails(request);
	}

	public ResponseObject<ShowResponseVo> addShowDetails(ShowRequestVo request) throws DatabaseException, RecordAlreadyExistsException {
		return showService.addShowDetails(request);
	}

	public ResponseObject<List<ShowResponseVo>> getAllShowDetails() {
		return showService.getAllShowDetails();
	}

	@RequestMapping(method = RequestMethod.GET,value = MovieShowConstant.SHOW_BY_ID)
	public ResponseObject<ShowResponseVo> getShowDetailsByShowId(long showId) throws ShowNotFoundException {
		return showService.getShowDetailsByShowId(showId);
	}
}
