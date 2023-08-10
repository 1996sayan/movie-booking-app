package com.movie.inventory.service;

import org.springframework.stereotype.Service;

import com.movie.inventory.vo.MovieRequestVo;
import com.movie.inventory.vo.MovieResponseVo;
import com.movie.inventory.vo.ResponseObject;

@Service
public interface MovieService {

	ResponseObject<MovieResponseVo> addMovieDetails(MovieRequestVo request);
}
