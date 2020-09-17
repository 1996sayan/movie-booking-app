package com.movie.inventory.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.inventory.vo.ResponseObject;
import com.movie.inventory.vo.ShowResponseVo;

@Service
public interface ShowService {

//	ResponseObject<ShowResponseVo> addShowDetails(AddShowRequestVo request,
//			ResponseObject<MovieResponseVo> movieResponse, ResponseObject<ScreenResponseVo> screenResponse);

	ResponseObject<List<ShowResponseVo>> getAllShowDetails();

	ResponseObject<ShowResponseVo> getShowDetailsByShowId(long showId);
}
