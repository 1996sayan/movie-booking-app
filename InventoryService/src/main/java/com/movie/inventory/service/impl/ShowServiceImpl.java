package com.movie.inventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.inventory.dao.ShowDao;
import com.movie.inventory.service.ShowService;
import com.movie.inventory.vo.ResponseObject;
import com.movie.inventory.vo.ShowResponseVo;

@Service
public class ShowServiceImpl implements ShowService {

	/**
	 * showRepository
	 */
	@Autowired
	ShowDao showRepository;

//	@Override
//	public ResponseObject<ShowResponseVo> addShowDetails(AddShowRequestVo request,
//			ResponseObject<MovieResponseVo> movieResponse, ResponseObject<ScreenResponseVo> screenResponse) {
//		if (movieResponse.getStatusCode() != 200) {
//		}
//		if (screenResponse.getStatusCode() != 200) {
//		}
//
////		if (showResponse.getData().getScreen().getSeatList().stream()
////				.anyMatch(seatNumber -> request.getSeatNumber().contains(seatNumber.getSeatNumber()))) {
////			throw new RecordNotFoundException("Seat not Present");
////		}
////
////		if (bookingRepository.isSeatPresent(request.getSeatNumber())) {
////			throw new RecordAlreadyExistsException("seat already booked");
////		}
//
//		Show show = (Show) BeanUtil.copyProp(request, Show.class);
//		show = showRepository.saveAndFlush(show);
//
//		ResponseObject<ShowResponseVo> response = new ResponseObject<ShowResponseVo>();
//		response.setData((ShowResponseVo) BeanUtil.copyProperties(show, ShowResponseVo.class));
//		response.setStatusCode(200);
//		response.setUserMessage("Output message");
//
//		return response;
//	}

	@Override
	public ResponseObject<List<ShowResponseVo>> getAllShowDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseObject<ShowResponseVo> getShowDetailsByShowId(long showId) {
		// TODO Auto-generated method stub
		return null;
	}

}
